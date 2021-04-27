package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOVIND KOCHAR\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://touch.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("m_login_email")).sendKeys("9766662923");
		
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("surjit123@");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		
		
		

	}

}
