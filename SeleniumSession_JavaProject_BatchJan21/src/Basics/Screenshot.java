package Basics;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream.PutField;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOVIND KOCHAR\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://touch.facebook.com/");
		Thread.sleep(2000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\GOVIND KOCHAR\\Desktop\\screenshot\\fb.jpeg");
		
		FileHandler.copy(source, dest);
	
		
		
	//	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//String random = RandomString.make(3);
		
		//File dest = new File("C:\\Users\\GOVIND KOCHAR\\Desktop\\screenshot\\image1+"+random+".jpeg");
		
		//FileHandler.copy(source, dest);
		
		driver.close();
		
		
		
		
		
	}

}
