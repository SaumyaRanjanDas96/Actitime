//was to check wheather email textbox or password or phone text box are assigned or not 

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserNameAssigned {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
    public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	if(driver.getPageSource().contains("Username")) {
		System.out.println("username text box is present");
	}
	else {
		System.out.println("text is not present");
	}
    
	}
}
