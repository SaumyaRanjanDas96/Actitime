
//was to print value present in username text box of actitime app
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValuePresentINTextBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String username = driver.findElement(By.id("username")).getAttribute("type");
		System.out.println(username);
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
