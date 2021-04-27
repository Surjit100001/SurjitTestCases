package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverInit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOVIND KOCHAR\\Desktop\\chromedriver.exe");
		
	  WebDriver driver= new ChromeDriver();
	  Thread.sleep(5000);
	  
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
         System.out.println(title);
	}

}
