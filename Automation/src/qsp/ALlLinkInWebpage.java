//was to print all the link present in a webpage

package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALlLinkInWebpage {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
    driver.get("https://demo.actitime.com/login.do");
   List<WebElement> alllink=driver.findElements(By.tagName("td"));//return tyope of findelemnets is list<webwlwment>
   int count = alllink.size();
   System.out.println(count);
   WebElement link=alllink.get(0);
   String text = link.getText();
   System.out.println(text);
   driver.close();
   
   
    
}
}
