package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTagName {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("C:\\Users\\SANDEEP NAYAK\\Desktop\\Demo.html");
    WebElement tagname = driver.findElement(By.tagName("a"));
    tagname.click();
    Thread.sleep(4000);
    driver.close();
}
}
