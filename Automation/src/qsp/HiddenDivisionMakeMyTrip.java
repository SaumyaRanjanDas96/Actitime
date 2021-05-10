package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionMakeMyTrip {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://www.makemytrip.com/");
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@class=\"fsw_inputBox dates inactiveWidget \"]")).click();
Thread.sleep(1000);
//previous button
driver.findElement(By.xpath("//span[@class=\"DayPicker-NavButton DayPicker-NavButton--prev\"]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("(//div[@aria-label=\"Wed Mar 31 2021\"])[1]")).click();
Thread.sleep(3000);
driver.findElement(By.className("lbl_input latoBold appendBottom10")).click();
Thread.sleep(3000);
//next month
 driver.findElement(By.className("DayPicker-NavButton DayPicker-NavButton--next")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//div[@aria-label=\"Thu Jun 03 2021\"])[2]")).click();
Thread.sleep(3000);
driver.close();


}
}
