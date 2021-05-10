package qsp;

import java.io.File;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUploadResume {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		Thread.sleep(10000);
		WebDriver driver=new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.get("https://www.techgig.com/upload-resume");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name=\"email\"])[2]")).sendKeys("srdas96@hotmail.com");
		Thread.sleep(3000);
		String cpatchaval = JOptionPane.showInputDialog("Please enter the captcha");
		driver.findElement(By.className("rc-anchor rc-anchor-normal rc-anchor-light")).sendKeys(cpatchaval);
		Thread.sleep(1000);
		
		
		/*driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys("‪C:\\Users\\SANDEEP NAYAK\\Desktop\\Naandhi.srt");
		Thread.sleep(1000);
		*/
		
		File f=new File("./data/Naandhi.srt");
		Thread.sleep(3000);
		String apath = f.getAbsolutePath();
		System.out.println(apath);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys(apath);
		Thread.sleep(20000);
		driver.close();
	}

}
