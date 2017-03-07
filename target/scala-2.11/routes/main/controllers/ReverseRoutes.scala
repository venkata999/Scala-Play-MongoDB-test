
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/venkatamutyala/Dev/VOA/VOA_Scala_Mongo_Test/conf/routes
// @DATE:Sun Mar 05 16:51:39 GMT 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:3
package controllers {

  // @LINE:3
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def userDataForm(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "userdata")
    }
  
    // @LINE:4
    def userDataSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "userdata")
    }
  
  }


}
