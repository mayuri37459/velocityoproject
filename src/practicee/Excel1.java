package practicee;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		String path= "C:\\Users\\Win 8\\Desktop\\kirqana list.xlsx";
		
		FileInputStream input= new FileInputStream(path);
	String a=	WorkbookFactory.create(input).getSheet("family").getRow(1).getCell(0).getStringCellValue();   //getSheet will have the name of the sheet you are
																											//working on, getStringCellValue is used when the 
 System.out.println(a);																						//table data is in string format
 

	}

}
