package steps.sikuliX

import io.cucumber.scala.{EN, ScalaDsl}
import org.sikuli.script.{Key, Pattern}
import util.SikulixUtil

class TimeOutStepDefs extends ScalaDsl with EN with SikulixUtil {

  Given("""I open google chrome""") { () =>
    screen.click(imageBasePath + "chromeIcon.png")
  }

  Given("""Google Chrome has loaded""") { () =>
    assert(checkIfExists(imageBasePath + "googleHomepage.png",  0.9))
  }

  Then("""I enter the web address to the login page""") { () =>
    screen.`type`("http://localhost:9001/users/login")
    screen.keyDown(Key.ENTER)
  }

  Then("""I am on the login page""") { () =>
    assert(checkIfExists(imageBasePath + "loginScreen.png",  0.9))
  }

  Then("""I enter my username""") { () =>
    enterText(imageBasePath + "nameTextInput.png","user1")
  }

  Then("""I enter my password""") { () =>
    enterText("""C:\Users\wwwbl\Desktop\TimeoutAT\src\test\resources\images\passwordTextInput.png""","12345")
  }

  Then("""I click login""") { () =>
    screen.click("""C:\Users\wwwbl\Desktop\TimeoutAT\src\test\resources\images\loginButton.png""")
  }

  Then("""I should be on the login landing page""") { () =>
    assert(checkIfExists("""C:\Users\wwwbl\Desktop\TimeoutAT\src\test\resources\images\loginLandingPage.png""",  0.9))
  }

  Then("""I wait for the timeout Popup""") { () =>
    assert(checkIfExists("""C:\Users\wwwbl\Desktop\TimeoutAT\src\test\resources\images\timeoutPopUp.png""",  0.8))
  }

  Then("""I click stay signed in""") { () =>
    val pattern = new Pattern("""C:\Users\wwwbl\Desktop\TimeoutAT\src\test\resources\images\timeoutPopUp.png""").targetOffset(-111, 50)
    screen.click(pattern)

  }

  Then("""I click on sign out""") { () =>
    val pattern = new Pattern("""C:\Users\wwwbl\Desktop\TimeoutAT\src\test\resources\images\timeoutPopUp.png""").targetOffset(53, 45)
    screen.click(pattern)
  }
}
