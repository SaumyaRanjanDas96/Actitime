package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPop {
	static{

		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.com/");
Robot r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_P);
Thread.sleep(1000);

r.keyRelease(KeyEvent.VK_CONTROL);
Thread.sleep(1000);

r.keyPress(KeyEvent.VK_TAB);
Thread.sleep(1000);

r.keyPress(KeyEvent.VK_UP);
Thread.sleep(1000);

r.keyPress(KeyEvent.VK_TAB);
Thread.sleep(1000);

r.keyPress(KeyEvent.VK_TAB);
Thread.sleep(1000);

r.keyPress(KeyEvent.VK_TAB);
Thread.sleep(1000);

r.keyPress(KeyEvent.VK_TAB);
Thread.sleep(1000);

r.keyPress(KeyEvent.VK_TAB);
Thread.sleep(1000);

r.keyPress(KeyEvent.VK_TAB);
Thread.sleep(1000);


r.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(1000);

driver.close();



}
}
