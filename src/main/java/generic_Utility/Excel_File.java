package generic_Utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_File {

	public String getExcelData(String sheetname, int rowNum, int cellNum) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/Book1Excel.xlsx");
		Workbook book = WorkbookFactory.create(fis);
//		Sheet sh = book.getSheet(sheetname);
//		Row row = sh.getRow(rowNum);
//		Cell cell = row.getCell(cellNum);
//		String data = cell.getStringCellValue();
//		return data;
//		
		DataFormatter format = new DataFormatter();
		return format.formatCellValue(book.getSheet(sheetname).getRow(rowNum).getCell(cellNum));

	}
}
