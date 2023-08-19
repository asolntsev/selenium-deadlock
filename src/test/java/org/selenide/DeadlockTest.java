package org.selenide;

import org.junit.jupiter.api.RepeatedTest;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeadlockTest {

  @RepeatedTest(10)
  void pureSelenium() {
    ChromeDriver driver = new ChromeDriver();
    try {
      for (int i = 0; i < 10; i++) {
        driver.register(uri -> true, UsernameAndPassword.of("", ""));
        driver.navigate().to("https://duckduckgo.com");
        String title = driver.getTitle();
      }
    } finally {
      driver.quit();
    }
  }

}
