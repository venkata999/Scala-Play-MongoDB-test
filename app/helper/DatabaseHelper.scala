package helper

import com.mongodb.casbah.{ MongoClient, MongoClientURI }
import com.typesafe.config.ConfigFactory
/**
  * This file is for Mongo DB connection details
  * Created by venkatamutyala
  */

object DatabaseHelper {
  private val config = ConfigFactory.load()
  private val DATABASE = config.getString("mongodb.default.db")
  private val server = MongoClientURI(config.getString("mongodb.default.uri"))
  private val client = MongoClient(server)
  val db = client(DATABASE)
}