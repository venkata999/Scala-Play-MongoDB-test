
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/venkatamutyala/Dev/VOA/VOA_Scala_Mongo_Test/conf/routes
// @DATE:Sun Mar 05 16:51:39 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
