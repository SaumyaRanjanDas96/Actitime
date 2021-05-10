package qsp;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchSpecificOptionMtrListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
 	WebDriver driver=new ChromeDriver();
 	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 	Scanner sc = new Scanner(System.in);
 	String expectedtext=sc.nextLine();
 	
driver.get("file:///C:/Users/SANDEEP%20NAYAK/Desktop/srd%20html%20notepad/Singleselectlistbox.html");
Thread.sleep(1000);

WebElement mtrlistbox = driver.findElement(By.id("mtr"));
Thread.sleep(1000);
Select s=new Select(mtrlistbox);
List<WebElement> alloption = s.getOptions();
Thread.sleep(1000);
int count=alloption.size();
int found=0;//initialize an userdefined referrence varible . according to this the if elseif condition works
for(int i=0;i<count;i++) {
	String actualtext=alloption.get(i).getText();
	if(actualtext.equals(expectedtext)) {//entererd  text is present then  found increment takes place
		found++;
	}
	else if(found==0) {
		System.out.println(expectedtext +"is not present");
	}
	else if(found==1) {
		System.out.println(expectedtext +"is present");
	}
	else if(found>1) {
		System.out.println(expectedtext +"is present burt duplicate");
	}
}
driver.close();
}
}
