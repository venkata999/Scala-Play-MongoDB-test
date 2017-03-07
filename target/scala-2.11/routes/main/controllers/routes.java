
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/venkatamutyala/Dev/VOA/VOA_Scala_Mongo_Test/conf/routes
// @DATE:Sun Mar 05 16:51:39 GMT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
  }

}
