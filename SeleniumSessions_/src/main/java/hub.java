import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hub {

	
	public static void main(String[] args) throws InterruptedException {
		
		

		By username = By.id("username");
		By pwd = By.id("password");
		By loginButton = By.id("loginBtn");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		driver.findElement(username).sendKeys("admin@gmail.com");
		driver.findElement(pwd).sendKeys("admin123");
		driver.findElement(loginButton).click();
		
	}
}
