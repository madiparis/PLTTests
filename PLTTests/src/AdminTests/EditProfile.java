/**
 * Test for the "Edit Profile" option on admin page.
 */
package AdminTests;

import org.junit.*;
import org.openqa.selenium.*;

public class EditProfile extends Helper.CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void mainTest() {
    driver.get(baseUrl + "/");
    driver.findElement(By.cssSelector("b > a")).click();
    driver.findElement(By.id("user_contact")).clear();
    driver.findElement(By.id("user_contact")).sendKeys("Admin1");
    driver.findElement(By.id("user_password")).clear();
    driver.findElement(By.id("user_password")).sendKeys("admin1");
  }


}