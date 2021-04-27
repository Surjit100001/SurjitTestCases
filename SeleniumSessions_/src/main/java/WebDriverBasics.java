import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	

	public static void main(String[] args) {

		//windows:
		//System.setProperty("webdriver.chrome.driver", "c:\\users\\downlods\\chromedriver.exe");
		//MAC
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOVIND KOCHAR\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.get("http://www.google.com");//enter url
		
		String title = driver.getTitle();//get the title of the page
		System.out.println("page title is: " + title);
		
		//verification point/checkpoint: actual vs expected
		if(title.equals("Google")){
			System.out.println("correct title");
		}
		else{
			System.out.println("in correct title");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		driver.quit();
	}

	
	

}
