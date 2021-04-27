package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementInspect {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOVIND KOCHAR\\Desktop\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");  //- site will get hitted
		//driver.close(); // close the current browser
		//driver.quit();    //close the all browsers
		
		
		//driver.navigate().to("https://support.google.com/chrome/?p=help&ctx=keyboard#topic=9796470");
		
		driver.manage().window().maximize();
		
//		Dimension d = new Dimension(200, 400);
//		driver.manage().window().setSize(d);
		
		Thread.sleep(2000);
		
//		Point p = new Point(200, 200);
//		driver.manage().window().setPosition(p);
//		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String dom = driver.getPageSource();
		System.out.println(dom);
		
		
	
		
		
		
	}

}
