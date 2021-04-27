package ajioFashion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AJIOFASHIONKIDS
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOVIND KOCHAR\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.ajio.com");
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        
        Thread.sleep(3000);
       
        List<WebElement> kidsClothList = driver.findElements(By.xpath("//ul[@class=\"level-first false\"]/li"));
        for(int i=0; i<=kidsClothList.size()-1; i++)
        {
        	String TextCloths = kidsClothList.get(i).getText();
        	System.out.println(TextCloths);
        	System.out.println("================================================================");
        	
        	if(kidsClothList.equals("KIDS"))
        	{
        		WebElement hu = kidsClothList.get(i);
//        	WebElement moveToKids = driver.findElement(By.xpath("//a[contains(text(), 'KIDS')]"));
               Actions act = new Actions(driver);
               act.moveToElement(hu);
               act.click();
        	}
        }

	}

}
