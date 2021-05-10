package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinks {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
//here we are getting all the links present with tag name "input"
List<WebElement> allink=driver.findElements(By.tagName("tr"));
//here we are counting the no of links present 
int count = allink.size();
//here we are  getting tehe no of links presnt with tagname input
System.out.println(count);
//by putting index we are sequentially getting the link prsent (one by one)
WebElement link = allink.get(0);
String text = link.getText();
System.out.println(text);
driver.close();
}
}
