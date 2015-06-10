/**
 * Test for "Photos" tab for admin.
 */
package AdminTests;

import org.junit.*;
import org.openqa.selenium.*;

public class Photos extends Helper.CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void mainTest() {
    driver.get(baseUrl + "/articles");
    driver.findElement(By.linkText("Photos")).click();
  }
}