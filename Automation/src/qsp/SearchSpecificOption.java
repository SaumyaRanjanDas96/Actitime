
//was to search specific option in a listbox
package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchSpecificOption {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	//we are getting the control of skill list box
	WebElement skill = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
	Thread.sleep(1000);
	Select s=new Select(skill);
	//we are passing android as argument through visible text method
	s.selectByVisibleText("Android");
	Thread.sleep(1000);
	//here we are getting the specific option we want to get
	WebElement firstoption = s.getFirstSelectedOption();
	Thread.sleep(1000);
	
	//we are getting the text present in android
	System.out.println("first option :" + firstoption.getText());
	Thread.sleep(1000);
	//for all option present in the list box
	
	List<WebElement> alloption = s.getOptions();//for all value
	Thread.sleep(1000);
	for(WebElement w:alloption) {
		System.out.println("alloption are:-" + w.getText());
		Thread.sleep(1000);
	}
	driver.close();
	

	
	
	
}
}
