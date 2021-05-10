package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

}
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
WebElement acti = driver.findElement(By.xpath("//a[contains(.,'actiTIME Inc.')]"));
Thread.sleep(1000);
Actions a=new Actions(driver);
a.contextClick().perform();
Thread.sleep(1000);
Robot r=new Robot();
r.keyPress(KeyEvent.VK_W);//for opening in new window
Thread.sleep(2000);
driver.quit();



}
}
