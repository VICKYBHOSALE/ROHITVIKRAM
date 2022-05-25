package apachepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Idpwddatfetch 
{
 public static void main(String[] args) throws EncryptedDocumentException, IOException
 {
   	String path ="C:\\Users\\DjS\\Desktop\\practise apache.xlsx";
   	FileInputStream file=new FileInputStream(path);
   	Sheet idpwd = WorkbookFactory.create(file).getSheet("Sheet1");    
   	String U = idpwd.getRow(0).getCell(0).getStringCellValue();
   //	System.out.print(U);
   	String P = idpwd.getRow(0).getCell(1).getStringCellValue();
   	//System.out.print("      "+ P);
   int rows= idpwd.getLastRowNum();
   int cols = idpwd.getRow(1).getLastCellNum();
   
   for(int r=0;r<=rows;r++)
   {   Row IDPWD = idpwd.getRow(r);
	   for(int c=0;c<cols;c++) 
	   {
		  Cell cell= IDPWD.getCell(c);
		 switch (cell.getCellType())
		 {
		 case STRING:System.out.print(cell.getStringCellValue());break;
		 case NUMERIC:System.out.print(cell.getNumericCellValue());break;
		 case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
		 }
		 System.out.print("|");
	   }
	   System.out.println();
   }
   
     
   	
   	
   	
   	
 }
}
