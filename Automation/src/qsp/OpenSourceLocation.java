//was to print the x and y coordinates of submit button


package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSourceLocation {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException  {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
    driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("admin");
    driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
   WebElement login= driver.findElement(By.xpath("//a[@class=\"initial\"]"));
   int xLoc = login.getLocation().getX();
   int yLoc = login.getLocation().getY();
   System.out.println(xLoc);
   System.out.println(yLoc);
   Thread.sleep(4000);
   
   driver.close();
}
}
