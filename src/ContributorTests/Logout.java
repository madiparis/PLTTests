package ContributorTests;

import org.junit.*;
import org.openqa.selenium.*;

public class Logout {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Test
  public void testLogout() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Logout")).click();
  }
}
