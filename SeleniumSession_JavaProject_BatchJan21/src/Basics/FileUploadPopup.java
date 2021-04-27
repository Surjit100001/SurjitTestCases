package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOVIND KOCHAR\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		/*
		 * file upload
		 * for this type of popup type='file' attribute needed
		 */
		
		
		driver.get("https://www.monsterindia.com/seeker/registration");
		
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\GOVIND KOCHAR\\Desktop\\Sample.txt");
		
		
		

	}

}
