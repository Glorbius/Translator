import menu.Text
import scaner.Scan
import scala.io.StdIn

object Main {

  def main(args: Array[String]): Unit = {

    val scan = new Scan()
    val text = new Text()


    var choice: Int = 0
    text.welcome()

    while (choice != 3) {
      text.menu()
      choice = StdIn.readInt()
      if (choice == 1) {
        val model = Model(scan.getRussianWords(), scan.getEnglishWord())
        model.addWords()
      }

      if (choice == 2) {
        val model = Model(null, null)
        model.getAll()

      }
    }
  }

}

