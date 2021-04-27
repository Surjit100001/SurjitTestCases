package Basics;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOVIND KOCHAR\\Desktop\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  
		  driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		  
		  driver.switchTo().frame(driver.findElement(By.name("main")));
		  String textframe1 = driver.findElement(By.xpath("//html//body//h2")).getText();
		  System.out.println("This title is from first frame:"+textframe1);
		  
		  driver.switchTo().defaultContent();
		  
		  driver.switchTo().frame(driver.findElement(By.name("navbar")));
		  String textframe2=driver.findElement(By.linkText("No frames")).getText();
		  System.out.println("This title is from second frame:"+textframe2);
		  
		  driver.switchTo().parentFrame();
		  
	
		
	}

}
