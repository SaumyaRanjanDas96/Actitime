//was to print the firstselected option in slv list box

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelectedOption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
   driver.get("file:///C:/Users/SANDEEP%20NAYAK/Desktop/MultiSelect.html");
  WebElement slvlistbox=driver.findElement(By.id("slv"));
  Select s=new Select(slvlistbox);
  WebElement firstselect = s.getFirstSelectedOption();
  String text = firstselect.getText();
  Thread.sleep(1000);
  System.out.println(text);
  driver.close();
}
}
