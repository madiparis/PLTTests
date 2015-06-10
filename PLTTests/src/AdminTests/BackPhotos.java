/**
 * Test for "Back" option on "New Photo" page on "Photos" tab for admin.
 */
package AdminTests;

import org.junit.*;
import org.openqa.selenium.*;

public class BackPhotos extends Helper.CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void mainTest() {
    driver.get(baseUrl + "/articles/new");
    driver.findElement(By.linkText("Back")).click();
  }

}