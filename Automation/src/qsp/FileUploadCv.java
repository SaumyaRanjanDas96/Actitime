package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadCv {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("file:///C:/Users/SANDEEP%20NAYAK/Desktop/srd%20html%20notepad/cv.html");
Thread.sleep(1000);
//the path we are giving is absolute path

driver.findElement(By.id("cv")).sendKeys("C:\\Users\\SANDEEP NAYAK\\Desktop\\Naandhi.srt");
Thread.sleep(10000);


driver.close();
}
}
/*
 * we cann't directly use relative path
 * File f=new File(relativepath)
 *String apath=f.getabsolutepath()
 * sop(apath)
 */

