//was to print the all option which are presnt  in mtr list box

package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
   driver.get("file:///C:/Users/SANDEEP%20NAYAK/Desktop/MultiSelect.html");
  WebElement mtrlistbox=driver.findElement(By.id("mtr"));
  Select s=new Select(mtrlistbox);
  Thread.sleep(1000);
  List<WebElement> alloption = s.getOptions();
  Thread.sleep(1000);
  int count = alloption.size();
  Thread.sleep(1000);
  for(int i=0;i<count;i++) {
	  String text = alloption.get(i).getText();
	  System.out.println(text);
	  
  }
  Thread.sleep(1000);
  driver.close();
}
}
