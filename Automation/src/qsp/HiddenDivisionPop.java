//date format present in cleartrip


package qsp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cleartrip.com/");
	driver.findElement(By.xpath("//input[@id=\"DepartDate\"]")).click();
	Thread.sleep(1000);
	/*
	 * if you want print the next month then inspect next month
	 */
	driver.findElement(By.className("nextMonth ")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//a[.='17'])[2]")).click();
	
	
	
	
	driver.quit();
}
}
