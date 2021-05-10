//was to print the colour and font type of submit button

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColourAndfont {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
WebElement loginbtn=driver.findElement(By.xpath("//div[.='Login ']"));
String colourtext = loginbtn.getCssValue("color");
String fonttexttyp = loginbtn.getCssValue("font-family");
String fonttextsize = loginbtn.getCssValue("font-size");
 String backgroundclr = loginbtn.getCssValue("background-color");
 String backgroundimg = loginbtn.getCssValue("background-image");
 
System.out.println(colourtext);
System.out.println(fonttexttyp);
System.out.println(fonttextsize);
System.out.println(backgroundclr);
System.out.println(backgroundimg);
Thread.sleep(3000);
driver.close();


}
}
