import java.lang.*;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel2 {

	public static void main(String[] args) {
		try {
		FileInputStream fs = new FileInputStream("\"C:\\Users\\TJ\\Desktop\\demo.xlsx\"");
		
	    @SuppressWarnings("resource")
		XSSFWorkbook WB = new XSSFWorkbook(fs);
		XSSFSheet sheet = WB.getSheet("names");
		Row r = sheet.getRow(1);
		Cell c = r.getCell(0);
		String celldata = c.getStringCellValue();
		System.out.println(celldata);
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
			// TODO: handle exception
		}
		
		

	}

}
