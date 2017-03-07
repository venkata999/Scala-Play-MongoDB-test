
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object userDetails_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class userDetails extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[UserData],Seq[scala.Tuple2[String, String]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userform: Form[UserData], countries: Seq[(String, String)]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import play.api.Play.current
import play.api.i18n.Messages.Implicits._

Seq[Any](format.raw/*1.62*/("""

"""),format.raw/*6.1*/("""<h1>Some Useful Government Service</h1>
"""),_display_(/*7.2*/main("User Application")/*7.26*/ {_display_(Seq[Any](format.raw/*7.28*/("""

    """),_display_(/*9.6*/helper/*9.12*/.form(action = routes.UserController.userDataSubmit)/*9.64*/ {_display_(Seq[Any](format.raw/*9.66*/("""
        """),_display_(/*10.10*/inputText(userform("name"))),format.raw/*10.37*/("""
        """),_display_(/*11.10*/inputText(userform("sex"))),format.raw/*11.36*/("""
        """),_display_(/*12.10*/inputText(userform("age"))),format.raw/*12.36*/("""
        """),_display_(/*13.10*/select(field = userform("country"), options = countries)),format.raw/*13.66*/("""
        """),_display_(/*14.10*/inputText(userform("datecreated"))),format.raw/*14.44*/("""
        """),format.raw/*15.9*/("""<div class="buttons">
            <input type="submit" value="Apply"/>
        </div>
    """)))}),format.raw/*18.6*/("""
""")))}))
      }
    }
  }

  def render(userform:Form[UserData],countries:Seq[scala.Tuple2[String, String]]): play.twirl.api.HtmlFormat.Appendable = apply(userform,countries)

  def f:((Form[UserData],Seq[scala.Tuple2[String, String]]) => play.twirl.api.HtmlFormat.Appendable) = (userform,countries) => apply(userform,countries)

  def ref: this.type = this

}


}

/**/
object userDetails extends userDetails_Scope0.userDetails
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 23:36:49 GMT 2017
                  SOURCE: /Users/venkatamutyala/Dev/VOA/VOA_Scala_Mongo_Test/app/views/userDetails.scala.html
                  HASH: a1cb1365b5a483d729d7882cdb8f44fc1327882c
                  MATRIX: 581->1|822->61|850->153|916->194|948->218|987->220|1019->227|1033->233|1093->285|1132->287|1169->297|1217->324|1254->334|1301->360|1338->370|1385->396|1422->406|1499->462|1536->472|1591->506|1627->515|1748->606
                  LINES: 20->1|27->1|29->6|30->7|30->7|30->7|32->9|32->9|32->9|32->9|33->10|33->10|34->11|34->11|35->12|35->12|36->13|36->13|37->14|37->14|38->15|41->18
                  -- GENERATED --
              */
          