//was to copy the text present in user name textbox and paste it in password text box

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

}
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"ac");
	driver.findElement(By.name("pwd")).sendKeys(Keys.CONTROL+"av");
Thread.sleep(3000);
driver.close();
}
}
