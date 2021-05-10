package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionHealth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	driver.findElement(By.name("policynumber")).sendKeys("123");
	Thread.sleep(1000);
	WebElement dob = driver.findElement(By.name("dob"));
	Thread.sleep(1000);
	dob.click();
	WebElement month = driver.findElement(By.className("ui-datepicker-month"));
	month.click();
	Thread.sleep(1000);
	Select s=new Select(month);
	s.selectByVisibleText("Mar");
	Thread.sleep(1000);
	WebElement year = driver.findElement(By.className("ui-datepicker-year"));
	year.click();
	Thread.sleep(1000);
    Select s1=new Select(year);
    s1.selectByValue("1996");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//a[.='15']")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("alternative_number")).sendKeys("7978449223");
    
    Thread.sleep(1000);
    driver.findElement(By.id("renew_policy_submit")).click();
    
    
    
    driver.close();
    
}
}
