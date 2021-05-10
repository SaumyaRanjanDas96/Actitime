//was to select and deselect option present in mtr list box

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectLIstBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
        driver.get("‪C:\\Users\\SANDEEP NAYAK\\Desktop\\MultiSelect.html");
       WebElement mtrlistbox=driver.findElement(By.id("mtr"));
       Select s=new Select(mtrlistbox);
       Thread.sleep(1000);
       s.selectByValue("Puri");
       s.selectByIndex(2);
       s.selectByValue("c");
       if(s.isMultiple()==true) {
    	   s.deselectByIndex(1);
    	   s.deselectByValue("g");
    	   s.deselectByVisibleText("Idly");
    	   Thread.sleep(1000);
    	   
       }
       driver.close();
	}
	

}
