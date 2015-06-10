/**
 * Test for "Welcome" option on the top bar.
 */
package AdminTests;

import org.junit.*;
import org.openqa.selenium.*;

public class Welcome extends Helper.CommonCode {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void mainTest() {
    driver.get(baseUrl + "/plt/users/edit#");
    driver.findElement(By.cssSelector("b")).click();
  }
}