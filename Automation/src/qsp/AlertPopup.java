package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
	//as there are two frames present in a webpage we hava to move from one page to another as the try button present in secopn frame
	WebElement frame1 = driver.findElement(By.id("iframeResult"));
	Thread.sleep(1000);
	//swithing from one frame to another
	driver.switchTo().frame(frame1);
	
	
	WebElement cl = driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]"));
	Thread.sleep(1000);
	cl.click();
	Thread.sleep(1000);
	Alert a=driver.switchTo().alert();
	String text = a.getText();
	Thread.sleep(1000);
	System.out.println(text);
	Thread.sleep(1000);
	a.accept();
	Thread.sleep(1000);
	driver.close();
}

}
