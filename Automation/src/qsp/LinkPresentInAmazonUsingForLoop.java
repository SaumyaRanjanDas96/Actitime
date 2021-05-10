//was to finfd the no of link presnt in amazon and print the text of all link
/**
 * USING FOR LOOP
 */
package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPresentInAmazonUsingForLoop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
driver.get("https://www.amazon.in/");
List<WebElement>allink=driver.findElements(By.xpath("//a"));//orBy.xpath("//a")[use of xpath is preferable in most case]
int count = allink.size();
System.out.println(count);
/**we can also use for loop for index**/
 for(int i=0;i<=count;i++){
  WebElement link=allink.get(i);
  String Text=link.getText();
  System.out.println(Text);
  /**
   * WebElement link=allink.get(0);
    String text = link.getText();
    System.out.println(text);
**/
  driver.close();
}}
}
