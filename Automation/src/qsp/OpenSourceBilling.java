//was to remove the value present in the email textbox of opensourcebilling application


package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSourceBilling {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
    driver.navigate().to("http://demo.opensourcebilling.org/users/sign_in");
    driver.findElement(By.id("email")).clear();//clear() method is used to clear the value present in any textbox;;
}
}
