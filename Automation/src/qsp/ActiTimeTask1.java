package qsp;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTask1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://demo.actitime.com/login.do");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.id("username")).sendKeys("admin");
Thread.sleep(1000);
driver.findElement(By.name("pwd")).sendKeys("manager");
Thread.sleep(1000);
driver.findElement(By.xpath("//div[.='Login ']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("(//div[@class=\"popup_menu_icon\"])[4]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//a[.='About your actiTIME']")).click();
Thread.sleep(1000);
//hidden division popup
driver.findElement(By.xpath("//a[.='Read Service Agreement']")).click();
Thread.sleep(1000);
Set<String> alltab = driver.getWindowHandles();
Iterator<String> it = alltab.iterator();
Thread.sleep(1000);
String parentwh = it.next();
String childwh = it.next();
driver.switchTo().window(childwh);
Thread.sleep(1000);
driver.close();
driver.switchTo().window(parentwh);
Thread.sleep(1000);
driver.close();

}
}
