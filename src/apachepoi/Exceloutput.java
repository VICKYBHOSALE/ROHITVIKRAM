package apachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceloutput 

{
   public static void main(String[] args) throws EncryptedDocumentException, IOException
    {
	    String path="E:\\VIKRAMSINH BHOSALE\\ESTIMATE\\INTERIOR ITEMIZED ESTIMATE FOR DOHIFODE.xlsx";
	    FileInputStream file = new FileInputStream(path);
	    Double s = WorkbookFactory.create(file).getSheet("Sheet1").getRow(15).getCell(6).getNumericCellValue();
	    System.out.println(s);
    }
}
