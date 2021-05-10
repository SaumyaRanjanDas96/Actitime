//was to print all the options in sorted order(alphabatical order)

package qsp;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortedOrder {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	Thread.sleep(1000);
driver.get("file:///C:/Users/SANDEEP%20NAYAK/Desktop/srd%20html%20notepad/MultiSelect.html");
WebElement mtr = driver.findElement(By.id("mtr"));
Thread.sleep(1000);
Select s=new Select(mtr);
List<WebElement> alloption = s.getOptions();
Thread.sleep(1000);
int count = alloption.size();
System.out.println(count);
ArrayList<String> alltext = new ArrayList<String>();

for(int i=0;i<count;i++) {
	String text = alloption.get(i).getText();
	Thread.sleep(1000);
	alltext.add(text);
	Thread.sleep(1000);
}
driver.close();
}
}
