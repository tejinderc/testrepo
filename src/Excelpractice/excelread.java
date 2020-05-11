package Excelpractice;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelread {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream fs = new FileInputStream("C:\\Users\\TJ\\Desktop\\demo.xlsx");
		try {

			Workbook wb = WorkbookFactory.create(fs);
			Sheet s = wb.getSheet("names");
			Row r = s.getRow(2);
			Cell c = r.getCell(0);
			String celldata = c.getStringCellValue();
			System.out.println(celldata);

		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}


