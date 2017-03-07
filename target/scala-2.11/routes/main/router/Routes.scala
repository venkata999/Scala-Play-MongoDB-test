
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/venkatamutyala/Dev/VOA/VOA_Scala_Mongo_Test/conf/routes
// @DATE:Sun Mar 05 16:51:39 GMT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:3
  UserController_0: controllers.UserController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:3
    UserController_0: controllers.UserController
  ) = this(errorHandler, UserController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, UserController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userdata""", """controllers.UserController.userDataForm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userdata""", """controllers.UserController.userDataSubmit"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:3
  private[this] lazy val controllers_UserController_userDataForm0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userdata")))
  )
  private[this] lazy val controllers_UserController_userDataForm0_invoker = createInvoker(
    UserController_0.userDataForm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userDataForm",
      Nil,
      "GET",
      """""",
      this.prefix + """userdata"""
    )
  )

  // @LINE:4
  private[this] lazy val controllers_UserController_userDataSubmit1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userdata")))
  )
  private[this] lazy val controllers_UserController_userDataSubmit1_invoker = createInvoker(
    UserController_0.userDataSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userDataSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """userdata"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:3
    case controllers_UserController_userDataForm0_route(params) =>
      call { 
        controllers_UserController_userDataForm0_invoker.call(UserController_0.userDataForm)
      }
  
    // @LINE:4
    case controllers_UserController_userDataSubmit1_route(params) =>
      call { 
        controllers_UserController_userDataSubmit1_invoker.call(UserController_0.userDataSubmit)
      }
  }
}
