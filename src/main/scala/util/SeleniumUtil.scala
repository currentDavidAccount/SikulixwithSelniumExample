package util

import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}

trait SeleniumUtil {
  val options = new ChromeOptions
  options.addArguments("start-maximized")
  options.addArguments("disable-infobars")
  options.addArguments("--disable-extensions")
  options.addArguments("--disable-dev-shm-usage")
  options.addArguments("--no-sandbox")

  val driver = new ChromeDriver(options)
}
