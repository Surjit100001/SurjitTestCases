package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\GOVIND KOCHAR\\Desktop\\chromedriver.exe");
		 
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/r.php?locale=en_GB&display=page");
		
		Thread.sleep(5000);
		
		WebElement day = driver.findElement(By.id("day"));
		Select s=new Select(day);
		
		//s.selectByIndex(5);
		//s.selectByValue("5");
		s.selectByVisibleText("5");
		
		//additional to get all values
		List<WebElement> options = s.getOptions();
		
		int size=options.size();
		System.out.println("size is:"+size);
		
		// to print all values
		for(int i=0; i<=size-1; i++)
		{
			
			String text = options.get(i).getText();
			System.out.println(text);
		}
		
		
		
		
		
		
		
		
		
	}

}
