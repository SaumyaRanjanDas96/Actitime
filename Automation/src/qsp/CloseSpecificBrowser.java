
//was to close specific browser opened in naukri.com without using quit method

package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseSpecificBrowser {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.naukri.com/");
Thread.sleep(10000);
Set<String> allbrowser = driver.getWindowHandles();
for(String browser:allbrowser) {
driver.switchTo().window(browser);//here we are switching to all the page present in webpage
Thread.sleep(1000);
String title = driver.getTitle();
Thread.sleep(10000);
if(title.equals("HSBC")) {
	driver.close();
	
}
}
}
}

