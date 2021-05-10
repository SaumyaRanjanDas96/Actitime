//wap to perform forward backward and reverse function in a webpage
package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackForward {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.actitime.com/demo-request");
	driver.navigate().to("https://www.actitime.com/demo-request");
	//get method and navigate().to() method ussed for same pupose i.e for entering the url
	Thread.sleep(2000);
	driver.navigate().back();//for moving backword from the current webpage
    Thread.sleep(2000);
	driver.navigate().forward();//for moving forward to the current webpage 
	Thread.sleep(2000);
	driver.navigate().refresh();//for refreshing the webpage
	Thread.sleep(2000);
	driver.close();
	
	
	

}
}
