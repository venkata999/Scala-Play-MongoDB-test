package services

import com.google.inject.ImplementedBy
import play.api.libs.json.{JsObject, Reads}

import scala.concurrent.Future

@ImplementedBy(classOf[ApplicationService])
trait ApplicationOps {

  def getCountries(): Future[Seq[Country]]
}
