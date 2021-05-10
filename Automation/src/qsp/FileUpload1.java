package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_fileupload_create");
WebElement frame1 = driver.findElement(By.id("iframeResult"));
driver.switchTo().frame(frame1);
Thread.sleep(1000);
driver.findElement(By.xpath("//button[.='Try it']")).click();
Thread.sleep(1000);
//the path we are giving is absolute path

driver.findElement(By.id("myFile")).sendKeys("‪C:\\Users\\SANDEEP NAYAK\\Desktop\\srd html notepad\\Demo.html");
Thread.sleep(10000);


driver.close();
}
}
