package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcAlert {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

}
public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
driver.get("https://www.irctc.co.in/nget/train-search");
driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
driver.close();

}
}
