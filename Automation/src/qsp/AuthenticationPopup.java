package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthenticationPopup {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

	}
public static void main(String[] args) {
 	WebDriver driver=new FirefoxDriver();
 	// https://un:pw@------rest adress
 	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
 	

}
}
