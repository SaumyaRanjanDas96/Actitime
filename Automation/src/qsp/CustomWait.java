package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.xpath("//div[.='Login ']")).click();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
int i=0;
while(i<100) {
	try {
		driver.findElement(By.id("logoutLink")).click();
		System.out.println("logout completed");
	}
	catch(Exception e) {
		i++;
		
	}
}
driver.close();
}
}
