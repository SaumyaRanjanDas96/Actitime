//was to print the all the option which are selected in slv list box

package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelectedOption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
   driver.get("file:///C:/Users/SANDEEP%20NAYAK/Desktop/MultiSelect.html");
  WebElement slvlistbox=driver.findElement(By.id("slv"));
  Select s=new Select(slvlistbox);
  List<WebElement> allselect = s.getAllSelectedOptions();
  int count = allselect.size();
  System.out.println(count);
  /*                                     
   * WebElement select = allselect.get(0);
  String text = select.getText();
  Thread.sleep(1000);
  System.out.println(text);
  *///OR
  for(WebElement option:allselect) {
	  String text = option.getText();
	  System.out.println(text);
  }
  driver.close();
}
}
