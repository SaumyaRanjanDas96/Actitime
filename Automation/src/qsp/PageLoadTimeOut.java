//wast to check the login page is loaded within 7 sec or not

package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOut {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
driver.manage().timeouts().pageLoadTimeout(7,TimeUnit.SECONDS);
try {
	driver.get("https://demo.actitime.com/login.do");
	System.out.println("login page displayed within 7 second");
}
catch(Exception e) {
	System.out.println("login page not loaded within 7 secs");
	
}
driver.close();


}
}
