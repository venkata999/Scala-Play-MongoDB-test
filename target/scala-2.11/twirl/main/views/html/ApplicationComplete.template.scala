
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ApplicationComplete_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class ApplicationComplete extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(username: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""

"""),_display_(/*3.2*/main("User Application")/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""
    """),_display_(/*4.6*/if(!username.startsWith("error"))/*4.39*/{_display_(Seq[Any](format.raw/*4.40*/("""
        """),format.raw/*5.9*/("""<h1>Application Complete</h1>
        <h2>Thanks you
            <font color="red">"""),_display_(/*7.32*/username),format.raw/*7.40*/("""</font>
            for applying to this useful government service
        </h2>
    """)))}/*10.6*/else/*10.10*/{_display_(Seq[Any](format.raw/*10.11*/("""
    """),format.raw/*11.5*/("""<h2>
        <font color="red">"""),_display_(/*12.28*/username),format.raw/*12.36*/("""
        """),format.raw/*13.9*/("""Please correct errors on the form</font>
    </h2>
    """)))}),format.raw/*15.6*/("""
""")))}))
      }
    }
  }

  def render(username:String): play.twirl.api.HtmlFormat.Appendable = apply(username)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (username) => apply(username)

  def ref: this.type = this

}


}

/**/
object ApplicationComplete extends ApplicationComplete_Scope0.ApplicationComplete
              /*
                  -- GENERATED --
                  DATE: Mon Mar 06 01:08:58 GMT 2017
                  SOURCE: /Users/venkatamutyala/Dev/VOA/VOA_Scala_Mongo_Test/app/views/ApplicationComplete.scala.html
                  HASH: d81056eb2ad4117ffce50ea6f13b0f4f40a54e7b
                  MATRIX: 555->1|668->19|696->22|728->46|767->48|798->54|839->87|877->88|912->97|1022->181|1050->189|1154->275|1167->279|1206->280|1238->285|1297->317|1326->325|1362->334|1448->390
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|28->4|28->4|29->5|31->7|31->7|34->10|34->10|34->10|35->11|36->12|36->12|37->13|39->15
                  -- GENERATED --
              */
          