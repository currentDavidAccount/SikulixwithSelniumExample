package util

import org.sikuli.script.{Pattern, Screen}

trait SikulixUtil {
  //insert absolute path to the image folder(do not commit this)
  val imageBasePath = """"""

  val screen = new Screen()

  def checkIfExists(imagePath: String, similarity: Double): Boolean = {
    val pattern = new Pattern(imagePath)
    val loaded = screen.exists(pattern, 60)

    loaded.getScore > similarity
  }

  def enterText(imagePath: String, text: String): Unit = {
    screen.click(imagePath)
    screen.`type`(text)
  }
}
