
//was to print the title of all browser opened in naukri.com

package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllTitle {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.naukri.com/");
driver.findElement(By.xpath("//div[.='Jobs']")).click();
Thread.sleep(5000);
Set<String> allbrowser = driver.getWindowHandles();
for(String browser:allbrowser) {
driver.switchTo().window(browser);//here we are switching to all the page present in webpage
Thread.sleep(1000);
String title = driver.getTitle();
System.out.println(title);
Thread.sleep(1000);
}
driver.quit();
}
}
