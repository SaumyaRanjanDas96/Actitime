package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();

driver.get("https://www.makemytrip.com/");
driver.findElement(By.xpath("//span[.='From']")).click();
/**
driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("mumbai");
driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys(Keys.ARROW_DOWN);
driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys(Keys.ENTER);

**///code optimization
WebElement from = driver.findElement(By.xpath("//input[@placeholder=\"From\"]"));
Thread.sleep(1000);
from.click();
Thread.sleep(1000);
from.sendKeys("mumbai");
Thread.sleep(1000);
from.sendKeys(Keys.ARROW_DOWN);
Thread.sleep(1000);
from.sendKeys(Keys.ENTER);
Thread.sleep(1000);

driver.close();
	}
}
