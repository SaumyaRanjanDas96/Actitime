package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sbi {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
   public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.onlinesbi.com/");
         WebElement nri=driver.findElement(By.xpath("(//a[.='NRI Services'])[3]"));
         nri.click();
         driver.close();
        
}
}
