//was to get the actual title of specific browsr


package qsp;


import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SpecificBrowserClose {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new FirefoxDriver();
	
	driver.get("https://www.naukri.com/");
	String etitle = "HSBC";
	Set<String> allwh = driver.getWindowHandles();
	Thread.sleep(1000);
	for(String wh:allwh) {
		driver.switchTo().window(wh);
		Thread.sleep(2000);
		String actual = driver.getTitle();
		Thread.sleep(1000);
if(etitle.equals(actual)) {
	Thread.sleep(2000);
	
driver.close();				

		
	}
	
	}
}}
