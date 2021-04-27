package Basics;

import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOVIND KOCHAR\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		
		//*[@id="example"]/tbody/tr[1]/td[6]
		//*[@id="example"]/tbody/tr[10]/td[6]
		
		String beforexpath = "//*[@id='example']/tbody/tr[";
		String afterxpath = "]/td[6]";
		
		for(int i=1; i<=10; i++)
		{
			String actualxpath = beforexpath+i+afterxpath;
			WebElement salaryList = driver.findElement(By.xpath(actualxpath));
			System.out.println(i+ " ==> " +salaryList.getText());
			
		}
		
		
		
		
		
		
		
		
	}
	
	

}
