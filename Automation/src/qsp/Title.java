/*
 * how to get the title of a web page
 * getTitle() method used to get the title of a webpage
 */



package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	//whenever we use thread.sleep() method it throws an exception called InterruotedException
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actitime.com/demo-request");
		//getTitle method is present in WebDriver interface
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(4000);
		driver.close();
		
		
	}

}
