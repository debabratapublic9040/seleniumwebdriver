package DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AddRandomDataInSpecificRow {

	public static void main(String[] args) throws IOException {
		
        FileOutputStream file = new FileOutputStream("D:\\Debabrata Rout\\Eclipse Workplace\\seleniumwebdriver\\testData\\RandomdataFile1.xlsx");
		
	    XSSFWorkbook workbook=new XSSFWorkbook();
	    
	    XSSFSheet sheet=workbook.createSheet("RandomlyAddData");
	    
	    XSSFRow row = sheet.createRow(3);
	    XSSFCell cell = row.createCell(4);
	    
	    cell.setCellValue("Raja");
	    
	    workbook.write(file);
	    workbook.close();
	    file.close();
	    
	    System.out.println("Excel Created");
	    

	}

}
