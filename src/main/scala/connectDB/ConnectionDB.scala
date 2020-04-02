package ConnectDB

import java.sql.DriverManager

class ConnectionDB() {


  def setWords(rus: String, eng: String) = {


    val database_url = "jdbc:mysql://localhost/translate"
    val database_user = "macaron"
    val database_password = "123"
    val driver = "com.mysql.jdbc.Driver"
    val save = "SAVED"

    val sql = "INSERT INTO Words (Russian,English) VALUES (?,?)"
    try {
      Class.forName(driver)
      val connection = DriverManager.getConnection(database_url, database_user, database_password)
      try {
        val pst = connection.prepareStatement(sql)
        pst.setString(1, rus)
        pst.setString(2, eng)
        pst.executeUpdate
      } catch {
        case e: Exception =>
          e.printStackTrace()
      } finally connection.close()
    } catch {
      case e: Exception =>
        e.printStackTrace()
    }
  }


  def getWords() = {
    // connect to the database named "mysql" on the localhost
    val driver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://localhost/translate"
    val username = "macaron"
    val password = "123"


    // there's probably a better way to do this


    try {
      // make the connection
      Class.forName(driver)
      var connection = DriverManager.getConnection(url, username, password)

      // create the statement, and run the select query
      val statement = connection.createStatement()
      val resultSet = statement.executeQuery("SELECT * FROM Words")
      println("Russian           English \n-------------------------- \n")
      while (resultSet.next()) {
        val rus = resultSet.getString("Russian")
        val eng = resultSet.getString("English")
        println(rus + " =  " + eng)
      }
    } catch {
      case e: Exception => e.printStackTrace()
    }

  }


}
