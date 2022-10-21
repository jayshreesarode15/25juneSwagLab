package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	
	public static String getExelData (int row, int cell, String sheetName) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\SHREE\\eclipse-workspace\\ZerodhaKite\\src\\test\\resources\\TestData.xlsx");
				
		String value = WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();	
		
		return value;
			
		
	}

}
