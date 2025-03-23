package DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("D:\\Debabrata Rout\\Eclipse Workplace\\seleniumwebdriver\\testData\\myfile.xlsx");
		
	    XSSFWorkbook workbook=new XSSFWorkbook();
	    
	    XSSFSheet Sheet=workbook.createSheet("Data");
	    
	    XSSFRow row1=Sheet.createRow(0);
	    
	    row1.createCell(0).setCellValue("Name");
	    row1.createCell(1).setCellValue("ID");
	    row1.createCell(2).setCellValue("Language");
	    
         XSSFRow row2=Sheet.createRow(1);
	    
	    row2.createCell(0).setCellValue("Raka");
	    row2.createCell(1).setCellValue("2222");
	    row2.createCell(2).setCellValue("Python");
	    
	    
        XSSFRow row3=Sheet.createRow(2);
	    
	    row3.createCell(0).setCellValue("Rahul");
	    row3.createCell(1).setCellValue("3333");
	    row3.createCell(2).setCellValue("C#");
	    
         XSSFRow row4=Sheet.createRow(3);
	    
	    row4.createCell(0).setCellValue("Raja");
	    row4.createCell(1).setCellValue("1111");
	    row4.createCell(2).setCellValue("Java");
	    
	    workbook.write(file);
	    workbook.close();
	    file.close();
	    
	    System.out.println("Excel Created--");

	}

}
