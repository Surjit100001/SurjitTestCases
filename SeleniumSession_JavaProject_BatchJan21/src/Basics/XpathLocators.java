package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOVIND KOCHAR\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://touch.facebook.com/");
		Thread.sleep(2000);
		
		//--id locator
		//driver.findElement(By.id("m_login_email")).sendKeys("surjit");
		
		//--name locator
		//driver.findElement(By.name("email")).sendKeys("akshay");
				
		
		//xpath by attribute
		//driver.findElement(By.xpath("//input[@id=\"m_login_email\"]")).sendKeys("jayesh");
		
		//xpath by text
		//driver.findElement(By.xpath("//a[text()= 'मराठी']")).click();
		
		//xpath by contains
		//driver.findElement(By.xpath("//a[contains(text(), 'मराठी')]")).click();
		
		//--linktext locator
		driver.findElement(By.linkText("मराठी")).click();
		
		Thread.sleep(2000);
		
		//--partial linktext
		driver.findElement(By.partialLinkText("lish")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
