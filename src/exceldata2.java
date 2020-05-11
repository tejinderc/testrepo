import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldata2 {

	public static void main(String[] args) throws Exception {
		
		
	File src = new File("C:\\Users\\TJ\\Desktop\\Book1.xlsx");
	FileInputStream fs =  new FileInputStream(src);
	XSSFWorkbook wb = new XSSFWorkbook(fs);
	XSSFSheet sheet1 = wb.getSheet("names");
	int lastrow = sheet1.getLastRowNum();
	System.out.println("The Last Row number is " + lastrow);
	
		for(int i =0; i<lastrow; i--)
		{
	     String exdata = sheet1.getRow(i).getCell(0).getStringCellValue();
		System.out.println("The data in row "+i+ " is " +exdata );

	}

}
}
