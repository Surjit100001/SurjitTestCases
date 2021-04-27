package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
public static void main(String[] args) throws InterruptedException {

	//ul[@class='erkvQe']//span
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOVIND KOCHAR\\Desktop\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	driver.findElement(By.name("q")).sendKeys("selenium");
	
	Thread.sleep(3000);

	List<WebElement> suggestionsList = driver.findElements(By.xpath("//ul[@class='erkvQe']//span"));
	
	System.out.println(suggestionsList.size());
	
	for(WebElement ele : suggestionsList){
		String text = ele.getText();
			if(text.equals("selenium grid")){
				ele.click();
				break;
			}
	}
	
}

}
