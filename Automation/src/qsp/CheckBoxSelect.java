//was to  check wheather the checckbox is selected or not


package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSelect {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
       if (driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).isSelected()) {
    	   System.out.println("check box is selected");
    	   
       }
       else {
    	   System.out.println("checkbox is not selected");
       }
	}

}
