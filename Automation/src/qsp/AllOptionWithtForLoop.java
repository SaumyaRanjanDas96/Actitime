//was to print the all option which are presnt  in mtr list box in without for loop

package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionWithtForLoop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
   driver.get("file:///C:/Users/SANDEEP%20NAYAK/Desktop/MultiSelect.html");
  WebElement mtrlistbox=driver.findElement(By.id("mtr"));
  Select s=new Select(mtrlistbox);
  Thread.sleep(1000);
  WebElement wrappedoption = s.getWrappedElement();//getwrappedelement willnot wait for timeout it will select which eelment is matching and select that
  Thread.sleep(1000);
  String text = wrappedoption.getText();
  Thread.sleep(1000);
  System.out.println(text);
  
	  
  driver.close();
}
}
