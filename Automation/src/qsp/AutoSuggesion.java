//was for autosuggestion 

package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggesion {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

}
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("java");
	Thread.sleep(3000);
	List<WebElement > allautosug=driver.findElements(By.xpath("//span[contains(.,'java')]"));
	int count=allautosug.size();
	System.out.println(count);
	for(int i=0;i<=count;i++){
		String text = allautosug.get(i).getText();
		System.out.println(text);
		allautosug.get(i).click();
	}
driver.close();
}
}
