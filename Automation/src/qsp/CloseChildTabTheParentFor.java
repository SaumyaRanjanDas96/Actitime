package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildTabTheParentFor {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(2000);

	driver.findElement(By.linkText("actiTIME Inc.")).click();
	String expectedtittle = driver.getTitle();

	Thread.sleep(1000);
	Set<String> alltabs = driver.getWindowHandles();
	int count = alltabs.size();
	System.out.println(count);
for(String tab:alltabs) {	
	driver.switchTo().window(tab);
	String actualtitle=driver.getTitle();
	Thread.sleep(1000);
	if(actualtitle.equals(expectedtittle)) {
	System.out.println(actualtitle);
	}
	else {
	driver.close();
	}
	System.out.println(tab);
	Thread.sleep(10000);
}
driver.quit();
}
}
	

