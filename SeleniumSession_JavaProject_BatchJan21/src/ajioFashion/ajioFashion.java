package ajioFashion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ajioFashion 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOVIND KOCHAR\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.ajio.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        driver.findElement(By.xpath("//input[@name=\"searchVal\"]")).sendKeys("jeans");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
          List<WebElement> jeans = driver.findElements(By.xpath("//div[@id=\"products\"]/div[@class=\"items\"]/div/div/div"));
          
          for(int i=0; i<=jeans.size()-1; i++)
          {
       
        	 String jeansText = jeans.get(i).getText();
        	 System.out.println(jeansText);
        	 System.out.println("=====================================================================");
        	 
        	 if(i==5)
        	 {
        		 break;
        	 }
        	 
          }
          
          driver.close();
   	}

}
