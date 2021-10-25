package steps.selenium

import io.cucumber.scala.{EN, ScalaDsl}
import util.SeleniumUtil

class TimeOutStepDefs extends ScalaDsl with EN with SeleniumUtil {

  Given ("""I enter the web address to the login page with Selenium""") { () =>
    driver.get("""http://localhost:9001/users/login""")
  }
}
