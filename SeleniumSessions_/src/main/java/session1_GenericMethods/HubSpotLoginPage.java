package session1_GenericMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HubSpotLoginPage {

	public static void main(String[] args) throws InterruptedException {

		By username = By.id("username");
		By pwd = By.id("password");
		By loginButton = By.id("loginBtn");
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.init_driver("chrome");
		
		br.launchUrl("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		System.out.println(br.getPageTitle());
		Thread.sleep(5000);
		
		ElementUtil ele = new ElementUtil(driver);
		ele.doSendKeys(username, "admin@gmail.com");
		ele.doSendKeys(pwd, "admin123");
		ele.doClick(loginButton);
		
		br.quitBrowser();
		
		
		
	}	
	
}
