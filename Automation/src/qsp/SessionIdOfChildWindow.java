//was to get the actual title of specific browsr


package qsp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionIdOfChildWindow {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new FirefoxDriver();
	
	driver.get("https://www.naukri.com/");
	
WebElement c1 = driver.findElement(By.xpath("//img[@src='https://company.naukri.com/popups/prokarma/26032021/prokarma-rs-250x250-26032021.gif']"));
c1.click();
Thread.sleep(2000);
//set of object
Set<String> handler = driver.getWindowHandles();
//iterate the value from set object
Iterator<String> it = handler.iterator();
Thread.sleep(1000);
String parentwindowid = it.next();
Thread.sleep(2000);
System.out.println(parentwindowid);
String childwindowid = it.next();
Thread.sleep(2000);
driver.switchTo().window(childwindowid);
Thread.sleep(1000);
/*
System.out.println("title of childwindow is:"+driver.getTitle());
Thread.sleep(2000);
*/
driver.close();



}
}