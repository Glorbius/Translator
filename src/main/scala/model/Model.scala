package Model

import ConnectDB.ConnectionDB

case class Model() {
  val con = new ConnectionDB()

  def addWords(rus:String,eng:String)= {

    con.setWords(rus,eng)
    println("Saved")

  }

  def getWords(): Unit = {
    con.getWords()


  }
}
