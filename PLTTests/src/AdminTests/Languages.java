/**
 * Test for "Languages" tab on admin page.
 */
package AdminTests;

import org.junit.*;
import org.openqa.selenium.*;

public class Languages extends Helper.CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void mainTest() {
    driver.get(baseUrl + "/languages");
    driver.findElement(By.linkText("Languages")).click();
  }
}