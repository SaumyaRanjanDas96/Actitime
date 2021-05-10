//process of matching selenium speed with the appn is called assynchrinization



package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id=\"logoutLink\"]")).click();
	Thread.sleep(1000);
	driver.close();
    
}
}
