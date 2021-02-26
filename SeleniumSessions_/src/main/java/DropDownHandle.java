

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOVIND KOCHAR\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select s = new Select(day);
		
		//s.selectByIndex(5);
		//s.selectByValue("2");
		//s.selectByVisibleText("4");
		
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println(size);
		
		for(int i=0; i<=size-1; i++)
		{
			String text = options.get(i).getText();
			System.out.println(text);
		}
		
		
		
		
		
		
		
		
		
	}

}
