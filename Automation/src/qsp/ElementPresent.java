//was to check wheather element is present in username and password textfield

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementPresent {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
    driver.get("https://demo.actitime.com/login.do");
   WebElement logbtn=driver.findElement(By.xpath("//input[@id=\"username\"]"));
   WebElement passbtn=driver.findElement(By.xpath("//input[@name=\"pwd\"]"));
   if(logbtn!=null) {
	   System.out.println("element is presnt");
   }
   else if(passbtn!=null) {
	   System.out.println("element is present");
   }
   else {
	   System.out.println("element is not present");
   }
}
}
