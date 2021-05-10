//was to click submit button in opensourcebilling app without using click method
/*
 * we can  use submit method instead of click method where type='submit' attribute present in html code 
 *  */

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
driver.get("http://demo.opensourcebilling.org/users/sign_in");
driver.findElement(By.id("")).submit();
driver.close();
}
}
