package controllers

import javax.inject.Inject

import com.mongodb.casbah.commons.MongoDBObject
import helper.DatabaseHelper
import play.api.data.Form
import play.api.data.Forms._
import play.api.libs.json._
import play.api.libs.json.Json
import services.{ApplicationOps, Country}
import play.api.mvc.{Action, Controller, MultipartFormData, Result}

import scala.concurrent.{ExecutionContext, Future}


/**
  * This is controller for User aplication
  * - Contains User form
  * - Validate the form Data
  * - Save form data into Mongo Database
 */


class UserController @Inject() (applications: ApplicationOps)(implicit ec: ExecutionContext) extends Controller {

  implicit val postWrites = Json.writes[UserData]

  val userForm:Form[UserData] = Form(
    mapping(
      "name" -> nonEmptyText,
      "sex" -> nonEmptyText,
      "age" -> number,
      "country" -> nonEmptyText,
      "datecreated" -> nonEmptyText
    )(UserData.apply)(UserData.unapply)
  )

  def userDataForm = Action.async{
    getCountries.map (country => Ok(views.html.userDetails(userForm, country.map(n => (n.name-> n.name)))))
  }

  def userDataSubmit = Action { implicit request =>

      userForm.bindFromRequest.fold(
        errors => {
          Ok(views.html.ApplicationComplete("error"))
        },
        user=> {
          val jsonval = Json.toJson(user)
          val db = DatabaseHelper.db
          val collection = db.getCollection("userdata")
          collection.insert(MongoDBObject(jsonval.toString()))
          Ok(views.html.ApplicationComplete(user.name))
        }
      )
  }

  def getCountries: Future[Seq[Country]] = {
  applications.getCountries()
}

}
case class UserData(name: String, sex: String, age: Int, country: String, datecreated: String)
