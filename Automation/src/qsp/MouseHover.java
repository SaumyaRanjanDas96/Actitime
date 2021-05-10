package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
driver.get("https://www.vtiger.com/");
WebElement resources = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
Thread.sleep(1000);
Actions a = new Actions(driver);
a.moveToElement(resources).perform();
Thread.sleep(1000);
driver.findElement(By.xpath("(//a[contains(.,'Contact Us')])[1]")).click();
Thread.sleep(1000);
String text = driver.findElement(By.xpath("//p[contains(.,'Bengaluru')]")).getText();
System.out.println(text);
Thread.sleep(1000);
driver.close();
	
	
	
	
}
}
