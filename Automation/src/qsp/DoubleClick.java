package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.vtiger.com/");
WebElement resource = driver.findElement(By.xpath("(//a[contains(.,'Resources')])[1]"));
Actions a=new Actions(driver);
a.moveToElement(resource).perform();
driver.findElement(By.xpath("(//a[contains(.,'Customer')])[1]")).click();
Thread.sleep(1000);
WebElement story = driver.findElement(By.xpath("//a[.='READ FULL STORY']"));
Thread.sleep(3000);

a.doubleClick(story).perform();
Thread.sleep(1000);
driver.quit();



}
}
