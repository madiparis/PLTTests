/**
 * Test for "Users" tab for admin.
 */
package AdminTests;

import org.junit.*;
import org.openqa.selenium.*;

public class Users extends Helper.CommonCode{
  private WebDriver driver;
  private String baseUrl;
 
  @Test
  public void mainTest() {
    driver.get(baseUrl + "/users");
    driver.findElement(By.linkText("Users")).click();
  }
}