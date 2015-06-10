/**
 * Test for the "Forgot Password" option on the login screen.
 */
package AdminTests;

import org.junit.*;
import org.openqa.selenium.*;

public class ForgotPassword extends Helper.CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void mainTest() {
    driver.get(baseUrl + "/plt/users/sign_in");
    driver.findElement(By.linkText("Forgot your password?")).click();
  }
}