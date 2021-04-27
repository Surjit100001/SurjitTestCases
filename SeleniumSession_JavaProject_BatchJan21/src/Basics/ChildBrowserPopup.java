package Basics;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOVIND KOCHAR\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/index.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String parent = driver.getWindowHandle();
		driver.findElement(By.linkText("Sign Up")).click();
		driver.findElement(By.linkText("Pricing")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		
		ArrayList<String> tab = new ArrayList<String>(allwindows);
		
		driver.switchTo().window(tab.get(2));
    	driver.findElement(By.xpath("//input[@placeholder=\"Phone Number\"]")).sendKeys("9766626356");
        Thread.sleep(5000);
		
		
		driver.switchTo().window(tab.get(1));
		Thread.sleep(5000);
		
		
//		driver.switchTo().window(parent);
//		driver.switchTo().defaultContent();
	
		
//		for(String child:allwindows)
//		{
//			if(!parent.equalsIgnoreCase(child))
//			{
//			driver.switchTo().window(child);
//			driver.findElement(By.xpath("//input[@placeholder=\"Phone Number\"]")).sendKeys("9766626356");
//			Thread.sleep(3000);
//			driver.close();
//			}
//		}
//		
//		driver.switchTo().window(parent);
//		driver.quit();
		
		
		
		
		
		
	
	
	}

}
