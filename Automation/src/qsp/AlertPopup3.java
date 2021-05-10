
/*go to http://demo.guru99.com/test/delete_customer.php
 *click on id type id
 *click on submit
 *alert popup will come
 *handle this 
 */

package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup3 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/delete_customer.php");
  driver.findElement(By.name("cusid")).sendKeys("39876");
  
  driver.findElement(By.name("submit")).submit();

 Thread.sleep(1000);
 Alert a=driver.switchTo().alert();
 String text = a.getText();
 Thread.sleep(1000);
 System.out.println(text);
 
 a.accept();
 String title = driver.getTitle();
 System.out.println(title);
 
 Thread.sleep(1000);
	driver.close();

}
}
