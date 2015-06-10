/**
 * Test for "New Post" option on "Posts" for admin.
 */
package AdminTests;

import org.junit.*;
import org.openqa.selenium.*;

public class NewPost extends Helper.CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void mainTest() {
    driver.get(baseUrl + "/installations");
    driver.findElement(By.linkText("+New post")).click();
  }
}