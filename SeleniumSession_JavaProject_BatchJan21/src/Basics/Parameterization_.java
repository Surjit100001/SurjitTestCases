package Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameterization_ {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOVIND KOCHAR\\Desktop\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
		

		for(int i=0; i<=4; i++)
		{
		FileInputStream excel;
		for(int j=0; j<=2; j++)	
		{
		excel=new FileInputStream("C:\\Users\\GOVIND KOCHAR\\Desktop\\users.xlsx");
		
	//	int value =  (int) WorkbookFactory.create(Excel).getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
		
	//	String valueAll=WorkbookFactory.create(excel).getSheet("Sheet1").getRow(2).getCell(j).getStringCellValue();
	//	String valueAll=WorkbookFactory.create(excel).getSheet("Sheet1").getRow(i).getCell(2).getStringCellValue();	
		
		String valueAll=WorkbookFactory.create(excel).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
		System.out.println(valueAll);
		
		
		}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
