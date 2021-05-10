package qsp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOPtionWithoutDuplicate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) {
	
	ChromeDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/SANDEEP%20NAYAK/Desktop/srd%20html%20notepad/Singleselectlistbox.html");
	WebElement mtr = driver.findElement(By.id("automationtools"));
   Select s=new Select(mtr);
   List<WebElement> alloption = s.getOptions();
   int count = alloption.size();
   System.out.println(count);
   ArrayList<String> alltext = new ArrayList<String>();
   for(int i=0;i<count;i++){
	   String text = alloption.get(i).getText();
	   System.out.println(text);
	   if(alltext.contains(text)) {
		   System.out.println(text);//if text is there it returns true otherwuse return false
	   }
		  
   }///mistake is there
   
		driver.close();
		

}
}
