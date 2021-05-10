package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}
public static void main(String[] args) {
	//here we are entering the browser
	WebDriver driver=new ChromeDriver();//upcasting
	//here we are entering the url
	driver.get("https://www.actitime.com/demo-request");
	//here we are closing the browser
	driver.close();
	
}
}
