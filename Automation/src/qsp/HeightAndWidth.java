//was to print the size and width of login button present in demo.actitime application

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightAndWidth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
WebElement loginbtn = driver.findElement(By.xpath("//input[@id=\"username\"]"));
int height = loginbtn.getSize().getHeight();
int width = loginbtn.getSize().getWidth();
System.out.println(height);
System.out.println(width);
driver.close();
}
}
