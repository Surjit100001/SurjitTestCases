package Basics;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locator {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOVIND KOCHAR\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		
		  WebDriver driver= new ChromeDriver();
		  		  
			driver.get("https://the-internet.herokuapp.com/nested_frames");
			Thread.sleep(5000);
			
			 List<WebElement> frames = driver.findElements(By.xpath("https://the-internet.herokuapp.com/nested_frames"));
			
			 System.out.println(frames.size());
			 
			 driver.close();
			 
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 
			 FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
					 .withTimeout(Duration.ofSeconds(20))
					 .pollingEvery(Duration.ofSeconds(5))
					 .ignoring(Exception.class);
      			
	
	
	
	
	
	
	
	
			
	}

}
