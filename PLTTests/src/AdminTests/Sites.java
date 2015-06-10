/**
 * Test for "Sites" tab for admin.
 */
package AdminTests;

import org.junit.*;
import org.openqa.selenium.*;

public class Sites extends Helper.CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void mainTest() {
    driver.get(baseUrl + "/articles");
    driver.findElement(By.linkText("Sites")).click();
  }
}