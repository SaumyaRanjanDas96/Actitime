package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.goibibo.com/");
driver.findElement(By.xpath("//div[@class=\"dF whiteBg col-sm-5 alignItemsCenter  col-md-2 \"]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//span[@class=\"DayPicker-NavButton DayPicker-NavButton--next\"]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@aria-label=\"Thu Apr 01 2021\"]")).click();
Thread.sleep(1000);

driver.findElement(By.xpath("//div[@class=\"dF whiteBg col-md-2 col-sm-5 alignItemsCenter\"]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//span[@class=\"DayPicker-NavButton DayPicker-NavButton--next\"]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("(//div[.='3'])[1]")).click();
Thread.sleep(1000);
driver.close();

}
}
