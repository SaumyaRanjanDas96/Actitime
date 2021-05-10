package qsp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildTabThenParent {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	//we are clicking on the actitime ic link by getting the xpath
	driver.findElement(By.linkText("actiTIME Inc.")).click();
	Thread.sleep(1000);
	Set<String> alltabs = driver.getWindowHandles();
	int count = alltabs.size();
	Thread.sleep(1000);
	Iterator<String> iter = alltabs.iterator();
	Thread.sleep(1000);
  String parentwh = iter.next();
  System.out.println(parentwh);
  String childwh = iter.next();
  System.out.println(childwh);
  //we need to switch to childwh for performin any action on child tab
  driver.switchTo().window(childwh);
  String titlech = driver.getTitle();
  Thread.sleep(1000);
  System.out.println(titlech);
  Thread.sleep(1000);
  //closing  the child tab
  driver.close();
  //switching to parent tab
  driver.switchTo().window(parentwh);
  String title = driver.getTitle();
  Thread.sleep(1000);
  System.out.println(title);
  driver.close();
  
  
	
}
	
	

}
