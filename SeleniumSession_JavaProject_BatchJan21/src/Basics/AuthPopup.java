package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOVIND KOCHAR\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//authpop
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		driver.close();
		
	}

}
