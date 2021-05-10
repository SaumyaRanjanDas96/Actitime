
//was to check wheather email text box is empty or not
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEmpty {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
 String log = driver.findElement(By.id("email")).getText();
if(log.isEmpty()) {
	System.out.println(" textbox is empty ");
}
else {
	System.out.println(" text box is not empty");
}
}
}
