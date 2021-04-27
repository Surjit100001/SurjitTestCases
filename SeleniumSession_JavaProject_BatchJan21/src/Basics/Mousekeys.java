package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousekeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOVIND KOCHAR\\Desktop\\chromedriver.exe");
			
		  WebDriver driver= new ChromeDriver();
		  Thread.sleep(5000);
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions actions = new Actions(driver);
		//actions.contextClick(rightclick).build().perform();
		
		actions.contextClick(rightclick).perform();
		
		List<WebElement> listoflinks = driver.findElements(By.xpath("//li[contains(@class,'context-menu-item')]"));
		
		for(WebElement links:listoflinks)
		{
			
			String text = links.getText();
			System.out.println(text);
		}
		
		
		
		
		
		
	}

}
