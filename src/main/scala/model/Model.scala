import connectDB.ConnectionDB

case class Model(val rus: String, val eng: String) {

  val connect = new ConnectionDB()

  def addWords(): Unit = {
    connect.setWords(rus,eng)
  }

  def getAll(): Unit = {
    connect.getWords()
  }
}

