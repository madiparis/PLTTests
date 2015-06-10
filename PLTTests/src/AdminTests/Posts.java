/**
 * Test for "Posts" tab for admin.
 */
package AdminTests;

import org.junit.*;
import org.openqa.selenium.*;

public class Posts extends Helper.CommonCode{
  private WebDriver driver;
  private String baseUrl;
  
  @Test
  public void mainTest() {
    driver.get(baseUrl + "/installations");
    driver.findElement(By.linkText("Posts")).click();
  }
}