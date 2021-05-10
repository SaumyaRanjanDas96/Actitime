package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginUsingPropertyFile {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
	public static void main(String[] args) throws IOException, InterruptedException{
		FileInputStream fis = new FileInputStream("./file/property1.property");
		Properties p = new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String un = p.getProperty("username");
		String pw=p.getProperty("password");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(1000);
		
		driver.findElement(By.id("username")).sendKeys(un);
		Thread.sleep(1000);
		
		driver.findElement(By.name("pwd")).sendKeys(pw);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(1000);
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}