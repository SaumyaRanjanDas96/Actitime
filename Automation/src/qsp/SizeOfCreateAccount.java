//was to print the size of sign up button present in instagram 


package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeOfCreateAccount {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://www.instagram.com/");

String fontsize = driver.findElement(By.xpath("//span[.='Sign up']")).getCssValue("font-size");
System.out.println(fontsize);
Thread.sleep(2000);
driver.close();
}
}

