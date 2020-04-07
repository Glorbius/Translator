package translator.model

import translator.database.Database

case class Model(val rus: String, val eng: String) {

  val connect = new Database()

  def addWords(): Unit = {
    connect.setWords(rus,eng)
  }

  def getAll(): Unit = {
    connect.getWords()
  }
}
