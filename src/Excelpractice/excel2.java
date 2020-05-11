package Excelpractice;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel2 {

	static XSSFWorkbook WB;
	static XSSFSheet sheet;

	public  excel2(String excelpath, String sheetname)
	{
		try {
			FileInputStream fs = new FileInputStream(excelpath);

			WB= new XSSFWorkbook(fs);
			sheet = WB.getSheet(sheetname);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}		
	}

	public static int rowcount()
	{
		try {
			
			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of rows : " + rowcount);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}
		return rowcount();
	}
	
	public String celldata(String sheetname, int rowNum, int colNum) {
		String cellvalue = null;
		try {
			
			
			cellvalue = WB.getSheet(sheetname).getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellvalue);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return cellvalue;
	}


	public double celldatanumber(String sheet, int rowNum, int colNum)
	{
		double num = 0;
		try {
			
			num = WB.getSheet(sheet).getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(num);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return num;
	}

	public static  void addexistingstringdata(int rowNum, int colNum, String value)
	{
		try {
			
			sheet.getRow(rowNum).createCell(colNum).setCellValue(value);
			FileOutputStream f0 = new FileOutputStream("C:\\Users\\TJ\\Desktop\\Book1.xlsx");
			WB.write(f0);
            WB.close();
            
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	
	public static  void addnewstringdata(int rowNum, int colNum, String value)
	{
		try {
			
			sheet.createRow(rowNum).createCell(colNum).setCellValue(value);
			FileOutputStream f0 = new FileOutputStream("C:\\Users\\TJ\\Desktop\\Book1.xlsx");
			WB.write(f0);
            WB.close();
            
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	
	public static  void addexistingnumdata(int rowNum, int colNum, double value)
	{
		try {
			
			sheet.getRow(rowNum).createCell(colNum).setCellValue(value);;
			FileOutputStream f0 = new FileOutputStream("C:\\Users\\TJ\\Desktop\\Book1.xlsx");
			WB.write(f0);
            WB.close();
            
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	
	public static  void addnewnumdata(int rowNum, int colNum, double value)
	{
		try {
			
			sheet.createRow(rowNum).createCell(colNum).setCellValue(value);
			FileOutputStream f0 = new FileOutputStream("C:\\Users\\TJ\\Desktop\\Book1.xlsx");
			WB.write(f0);
            WB.close();
            
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	
	public static  void createnewsheet(String newsheet)
	{
		try {
			
			WB.createSheet(newsheet);
			FileOutputStream f0 = new FileOutputStream("C:\\Users\\TJ\\Desktop\\Book1.xlsx");
			WB.write(f0);
            WB.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	
	
	public static  void deletesheet(int indexNum)
	{
		try {

			if(sheet != null)   {
				WB.removeSheetAt(indexNum);
				FileOutputStream f0 = new FileOutputStream("C:\\Users\\TJ\\Desktop\\Book1.xlsx");
				WB.write(f0);
				WB.close();

			}} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
				e.printStackTrace();
			}
	}
	
	public int lastrow(String sheet) {
		int lastrow =0;
		try {

			lastrow = WB.getSheet(sheet).getLastRowNum();
			System.out.println("Last row numvber is " + lastrow);


		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return lastrow;
	}	
}
