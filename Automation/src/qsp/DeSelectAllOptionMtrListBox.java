//was to select and deselect all the option prsent in mtr list box

package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectAllOptionMtrListBox {static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

}
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/SANDEEP%20NAYAK/Desktop/srd%20html%20notepad/MultiSelect.html");
WebElement	mtrlistbox=driver.findElement(By.id("mtr"));
Thread.sleep(1000);
Select s=new Select(mtrlistbox);
Thread.sleep(1000);
//get alloptions
List<WebElement> getalloption = s.getOptions();
Thread.sleep(1000);
//how many option prseent
int count = getalloption.size();
Thread.sleep(1000);
System.out.println(count);
for(int i=0;i<count;i++) {
	//select all the index by index(here we don't know the value and visibletext)
	s.selectByIndex(i);
	Thread.sleep(1000);
}
//deselcting all the selected option
s.deselectAll();
driver.close();
}
}
