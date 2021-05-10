//was to print allthe option present in mtr list box and deslct all

package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllDeselectInReverse {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("file:///C:/Users/SANDEEP%20NAYAK/Desktop/srd%20html%20notepad/MultiSelect.html");
WebElement mtrlistbox = driver.findElement(By.id("mtr"));
Thread.sleep(1000);
Select s=new Select(mtrlistbox);
Thread.sleep(1000);
List<WebElement> alloption = s.getOptions();
Thread.sleep(1000);
int count = alloption.size();
Thread.sleep(1000);
System.out.println(count);
for(int i=count-1;i>=0;i--) {
	s.selectByIndex(i);
	Thread.sleep(1000);
}
s.deselectAll();
driver.close();

}
}
