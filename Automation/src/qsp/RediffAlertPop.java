package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffAlertPop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
driver.findElement(By.xpath("//input[@value=\"Sign in\"]")).submit();
Thread.sleep(1000);
Alert a=driver.switchTo().alert();
String text = a.getText();
System.out.println(text);
Thread.sleep(1000);
a.accept();
Thread.sleep(1000);
driver.close();
}
}
