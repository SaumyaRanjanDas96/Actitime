package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
Thread.sleep(1000);
WebElement block1 = driver.findElement(By.xpath("//div[.='Stockholm']"));
Thread.sleep(1000);
WebElement block2 = driver.findElement(By.xpath("//div[.='Italy']"));
Actions a=new Actions(driver);
a.dragAndDrop(block1, block2).perform();
Thread.sleep(1000);
driver.close();

}
}
