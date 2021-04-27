package BrokenLinks;

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
import org.seleniumhq.jetty9.server.HttpConnection;

public class brokenLink 
{
	public static void main(String[] args) throws IOException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOVIND KOCHAR\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links : " +links.size());
		
		for(WebElement link:links)
		{
			
			String hreflist = link.getAttribute("href");
			URL url = new URL(hreflist);
			URLConnection urlconnection = url.openConnection();
			HttpURLConnection httpurlconnection = (HttpURLConnection) urlconnection;
			httpurlconnection.setConnectTimeout(5000);
			httpurlconnection.connect();                                                
			
			if(httpurlconnection.getResponseCode() == 200)
			{
				System.out.println(hreflist+ "-" +httpurlconnection.getResponseCode()+ "-" +httpurlconnection.getResponseMessage());
			}
			else
			{
				System.err.println(hreflist+ "-" +httpurlconnection.getResponseCode()+ "-" +httpurlconnection.getResponseMessage());

			}
           
			httpurlconnection.disconnect();
		}
		
		
	}
}
