/**
 * Test for "You" tab for admin.
 */
package AdminTests;

import org.junit.*;
import org.openqa.selenium.*;

public class You extends Helper.CommonCode{
	  private WebDriver driver;
	  private String baseUrl;
	  
	  @Test
	  public void mainTest() {
	    driver.get(baseUrl + "/");
	    driver.findElement(By.linkText("You")).click();
	  }
}