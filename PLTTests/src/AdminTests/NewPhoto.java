/**
 * Test for the "New Photo" option on the "Photo" tab for admin.
 */
package AdminTests;

import org.junit.*;
import org.openqa.selenium.*;

public class NewPhoto extends Helper.CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void mainTest() {
    driver.get(baseUrl + "/articles");
    driver.findElement(By.linkText("+New photo")).click();
  }
}