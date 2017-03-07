package services

import play.api.Logger
import play.api.data.validation.ValidationError
import play.api.libs.json._
import play.api.libs.ws.{WSClient, WSRequest, WSResponse}
import services.RestService.{JsonParseException, RestFailure}

import scala.concurrent.{ExecutionContext, Future}

/**
  * This file will communicate to external APIs
  * Created by venkatamutyala
  */

case class Country(name:String)

trait RestService {

  def ws: WSClient

  implicit def ec: ExecutionContext
  implicit val reads = Json.reads[Country]

  def getMany[A: Reads](url: String): Future[Seq[Country]] = {
    val request: WSRequest = ws.url(url)
    request.get.map { response =>
      response.status match {
        case 200 => {
            val d = Json.parse(response.json.toString())
            d.as[Seq[Country]]
        }
        case _ => throw RestFailure("GET", request, response)

      }
    }
  }

}
object RestService {

  case class JsonParseException(method: String, request: WSRequest, response: WSResponse, errs: Seq[(JsPath, Seq[ValidationError])]) extends Exception

  case class RestFailure(method: String, request: WSRequest, response: WSResponse) extends Exception {
    val status = response.status
  }

}