import Menu.Text
import Model.Model
import Scaner.Scan

import scala.io.StdIn

object Main {

  def main(args: Array[String]): Unit = {

    val scan = Scan()
    val text = Text()
    val translate = Model()
    //val connection = ConnectionDB() old


    var choice: Int = 0
    text.welcome()

    while (choice != 3) {
      text.menu()
      choice = StdIn.readInt()
      if (choice == 1) {
        translate.addWords(scan.getRussianWords(), scan.getEnglishWord())
        //connection.setWords(scan.getRussianWords(),scan.getEnglishWord()) old
      }

      if (choice == 2) {
        translate.getWords()
        //connection.getWords() old
      }
    }
  }

}

