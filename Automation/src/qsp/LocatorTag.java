package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTag {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("‪C:\\Users\\SANDEEP NAYAK\\Desktop\\Demo1.html");
	driver.findElement(By.tagName("a"));
	driver.findElement(By.id("a1"));
	driver.findElement(By.name("n1"));
	driver.findElement(By.className("c1"));
	driver.findElement(By.partialLinkText("Google")).click();
	

}
}
