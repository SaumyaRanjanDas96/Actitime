//was to get the actual title of specific browsr


package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActualTitle {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver =new FirefoxDriver();
	/*System.out.println("enter the title you want to print");
	Scanner sc=new Scanner(System.in);
	String expectedtitle = sc.nextLine();*/
	
	String expectedtitle="HSBC";
	driver.get("https://www.naukri.com/");
	Thread.sleep(10000);
	Set<String> allwh = driver.getWindowHandles();
	Thread.sleep(1000);
	for(String wh:allwh) {
		driver.switchTo().window(wh);
		Thread.sleep(1000);
		String actualtitle = driver.getTitle();
		if(actualtitle.contains(expectedtitle)) {
			Thread.sleep(2000);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(5000);
			driver.close();
			
		}
	}
}
}
