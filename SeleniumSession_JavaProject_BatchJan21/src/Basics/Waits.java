package Basics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits 
{
	

	public static void main(String[] args) 
	{
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOVIND KOCHAR\\Desktop\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          
          driver.get("https://classic.crmpro.com/");
          
         
//         WebDriverWait wait = new WebDriverWait(driver, 20);
//         wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username"))).sendKeys("surjit");
         
         FluentWait<WebDriver> wait2 = new FluentWait<WebDriver>(driver)
        		                      .withTimeout(Duration.ofSeconds(10))
        		                      .pollingEvery(Duration.ofSeconds(2))
        		                      .ignoring(NoSuchElementException.class);
         wait2.until(ExpectedConditions.presenceOfElementLocated(By.name("username"))).sendKeys("surjit");
         
         
         
          
          
          
	}

}
