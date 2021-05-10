package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement monthlistbox=driver.findElement(By.id("month"));
Select s = new Select(monthlistbox);
s.selectByVisibleText("Nov");
Thread.sleep(1000);
s.selectByIndex(10);
Thread.sleep(1000);
s.selectByValue("12");
Thread.sleep(1000);
driver.close();
}
}
