package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOVIND KOCHAR\\Desktop\\chromedriver.exe");
			
		  WebDriver driver= new ChromeDriver();
		  Thread.sleep(5000);
		
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
	//	actions.dragAndDrop(source, dest).build().perform();
		
		actions.clickAndHold(source).moveToElement(dest).release(dest).build().perform();
		
		
		
		
	}

}
