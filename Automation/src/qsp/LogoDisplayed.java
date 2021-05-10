//wsa to check wheather actitime logo is displayed or not


package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoDisplayed {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) {
 	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
WebElement	logo=driver.findElement(By.xpath("//div[@class=\"atProductName\"]"));
if(logo.isDisplayed()) {
	System.out.println("logo is displayed");
}
else {	
	System.out.println("logo is not displayed ");
}
	
}
}
