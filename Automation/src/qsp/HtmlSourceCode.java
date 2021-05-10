//wap to get the sourcecode of a webpage


package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlSourceCode {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//to get the sourcecode of a webpage we can use a method  getPageSource()
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
	}


}
