package config

import com.typesafe.config.{Config, ConfigFactory}

object Config {
  lazy val config: Config = ConfigFactory.load()

  def getProp (key:String) = {
    config.getString(key)
  }
}