//was to print the height and width of login button present in email login page and password textbox are equal or not



package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailHeight {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement loginbtn = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		int height = loginbtn.getSize().getHeight();
		int width = loginbtn.getSize().getWidth();
		WebElement passwordbtn = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		int pheight= passwordbtn.getSize().getHeight();
		int pwidth= passwordbtn.getSize().getHeight();


		
if(height==pheight) {
	System.out.println("matched");
	
}
else if(width==pwidth){
	System.out.println("matched");
	
}
else {
	System.out.println("not matched");
}
		driver.close();
	}

}
