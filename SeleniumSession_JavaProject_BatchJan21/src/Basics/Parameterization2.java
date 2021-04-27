package Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization2 {

	private void mani() throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		
//		FileInputStream excelfile = new FileInputStream("C:\\Users\\GOVIND KOCHAR\\Desktop\\users.xlsx");
//		
//		String printvalue = WorkbookFactory.create(excelfile).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
//		
//		System.out.println(printvalue);
		
		for(int i=0; i<=4; i++)
		{
			for(int j=0; j<=2; j++)
			{
			FileInputStream excelfile = new FileInputStream("C:\\Users\\GOVIND KOCHAR\\Desktop\\users.xlsx");
		
		String printvalue = WorkbookFactory.create(excelfile).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		
		System.out.println(printvalue);
		
			}
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
