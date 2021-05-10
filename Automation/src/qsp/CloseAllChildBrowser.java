//was to get the actual title of specific browsr


package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseAllChildBrowser {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.naukri.com/");
	Thread.sleep(2000);
	String expectedtitle = driver.getTitle();
	Thread.sleep(2000);
	Set<String> allwh = driver.getWindowHandles();
	for(String wh:allwh) {
		driver.switchTo().window(wh);
		Thread.sleep(1000);
		String actualtitle = driver.getTitle();
		if(actualtitle.equals(expectedtitle)) {//1st it will check else block will get executed next time it will check if block gets executed
		Thread.sleep(1000);
		System.out.println(actualtitle);
		}
		else {
			driver.close();
		}
		System.out.println(wh);
		Thread.sleep(10000);
			}
	driver.quit();
	}
}
