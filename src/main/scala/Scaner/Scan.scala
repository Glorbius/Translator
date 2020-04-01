package Scaner

import scala.io.StdIn

case class Scan() {


  def getRussianWords(): String = {

    val rus = StdIn.readLine("Введите слово на русском: \n")
    return rus
  }

  def getEnglishWord(): String = {
    val eng = StdIn.readLine("Write word on english: \n")
    return eng
  }


}
