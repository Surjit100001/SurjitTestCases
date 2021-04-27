package Basics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks 
{

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOVIND KOCHAR\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links : " +links.size());
		
		for(int i=0; i<=links.size(); i++)
		{
			WebElement ele = links.get(i);
			String hrefurl = ele.getAttribute("href");
			
			URL url = new URL (hrefurl);
			URLConnection urlconnection = url.openConnection();
			HttpURLConnection htttpurlconnection = HttpURLConnection (urlconnection);
			
			htttpurlconnection.setConnectTimeout(5000);
			htttpurlconnection.connect();
			
			if(htttpurlconnection.getResponseCode() == 200)
			{
				System.out.println(hrefurl+ "=>" +htttpurlconnection.getResponseCode()+ "=>" +htttpurlconnection.getResponseMessage());
			}
			else
			{
				System.out.println("not found");
			}
			
			
			
		}
		
		
	}

	private static HttpURLConnection HttpURLConnection(URLConnection urlconnection) {
		// TODO Auto-generated method stub
		return null;
	}

}
