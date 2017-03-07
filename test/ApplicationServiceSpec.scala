import com.google.inject.Inject
import controllers.UserController
import org.scalatestplus.play._
import play.api.test._
import play.api.test.Helpers._
import services.ApplicationService
import org.scalatest.{Matchers, WordSpec}
import play.api.libs.ws.WSClient

import scala.concurrent.ExecutionContext

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 * For more information, consult the wiki.
 */
class ApplicationServiceSpec  extends PlaySpec with OneAppPerTest {



  "UserController" should {

    "render the index page" in {
      val home = route(app, FakeRequest(GET, "/userdata")).get
      status(home) mustBe OK
      contentType(home) mustBe Some("text/html")
      contentAsString(home) must include ("<h1>Some Useful Government Service</h1>")
    }
  }

  "Config" should {

    "retrieve properties values" in {
     config.Config.getProp("countries.rest.url") mustBe("https://restcountries.eu/rest/v1/region/Europe")
    }
  }

 //TODO:- Need to write more Tests


}

