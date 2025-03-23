    package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		/*
		FileInputStream-reading
		FileOutputStream-Writing
		XSSFWorkbook-workbook
		XSSFSheet-sheet
		XSSFRow-row
		XSSFCell-cell
		*/
		
		FileInputStream file=new FileInputStream(".\\testData\\data.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1"); //XSSFSheet sheet=workBook.getSheetAt(0);
		int rowCount=sheet.getLastRowNum();
		int columnCount=sheet.getRow(0).getLastCellNum();//initial row
		//System.out.println(rowCount);//5
		//System.out.println(columnCount);//4
		
		for(int r=0;r<=rowCount;r++)
		{
			XSSFRow row = sheet.getRow(r);
			for(int c=0;c<columnCount;c++)
			{
				XSSFCell cell = row.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		workBook.close();
		file.close();
		
		
		

	}

}
