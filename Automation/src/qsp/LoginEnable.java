//was to check wheather login button is enabled or not

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginEnable {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
    driver.get("https://demo.actitime.com/login.do");
WebElement loginbtn=driver.findElement(By.xpath("//div[.='Login ']"));
if(loginbtn.isEnabled()) {
	System.out.println("login button is enabled ");
	
}
else {
	System.out.println("login button is not enabled");
}
}
}
