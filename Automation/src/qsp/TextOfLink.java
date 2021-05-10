//was to check text of a link present in actitime application (forgot password button link)

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextOfLink {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args ) {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	String forgotbtn = driver.findElement(By.id("toPasswordRecoveryPageLink")).getText();
	System.out.println(forgotbtn);
driver.close();


	
	
}
}
