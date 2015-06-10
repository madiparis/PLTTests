/**
 * Test for "New Site" option on "Sites" tab for admin.
 */
package AdminTests;

import org.junit.*;
import org.openqa.selenium.*;

public class NewSite extends Helper.CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void mainTest() {
    driver.get(baseUrl + "/sites");
    driver.findElement(By.linkText("+New site")).click();
  }
}