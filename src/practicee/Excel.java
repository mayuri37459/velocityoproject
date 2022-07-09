package practicee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		String path= "C:\\Users\\Win 8\\Desktop\\kirqana list.xlsx";
		
		FileInputStream input= new FileInputStream(path);
	//String a=	WorkbookFactory.create(input).getSheet("family").getRow(1).getCell(1).getStringCellValue();
Sheet b=  WorkbookFactory.create(input).getSheet("family");

String c= b.getRow(0).getCell(1).getStringCellValue();
//System.out.println(c);

for (int i=0; i<6; i++) 
{ 
	for (int j=0;j<2;j++)
{
	String d =b.getRow(i).getCell(j).getStringCellValue();
	System.out.print(d+" ");
}
	System.out.println(" ");
}



}}
