/**
 * Test for "New Language" option on "Languages" page for admin.
 */
package AdminTests;

import org.junit.*;
import org.openqa.selenium.*;

public class NewLanguage extends Helper.CommonCode{
	  private WebDriver driver;
	  private String baseUrl;
 
  @Test
  public void mainTest() {
    driver.get(baseUrl + "/languages");
    driver.findElement(By.linkText("+New language")).click();
  }
}