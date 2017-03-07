package services

import config.Config
import com.google.inject.Inject
import play.api.libs.json.Reads
import play.api.libs.ws.WSClient

import scala.concurrent.{ExecutionContext, Future}

/**
  * This will take request from internal Source
  * Created by venkatamutyala
  */

class ExternalURLs() {
  def countries = Config.getProp("countries.rest.url")
}

class ApplicationService @Inject()(val ws: WSClient)(implicit val ec: ExecutionContext)
  extends ApplicationOps with RestService {

  val urls = new ExternalURLs()

  override def getCountries(): Future[Seq[Country]] = {
    getMany[Country](urls.countries)
  }

}



