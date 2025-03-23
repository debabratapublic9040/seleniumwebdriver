package DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataDynamically {

	public static void main(String[] args) throws IOException {
		
        FileOutputStream file = new FileOutputStream("D:\\Debabrata Rout\\Eclipse Workplace\\seleniumwebdriver\\testData\\myfile12.xlsx");
		
	    XSSFWorkbook workbook=new XSSFWorkbook();
	    
	    XSSFSheet Sheet=workbook.createSheet("DynamicData");
	    
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.println("Enter row size");
	    int rowSize=sc.nextInt();
	    System.out.println("Exter column size");
	    int columnSize=sc.nextInt();
	    
	    
	    for(int r=0;r<=rowSize;r++)
	    {
	    	XSSFRow currentRow = Sheet.createRow(r);
	    	for(int c=0;c<columnSize;c++)
	    	{
	    		XSSFCell cell = currentRow.createCell(c);
	    		cell.setCellValue(sc.next());
	    	}
	    }
	    
	    workbook.write(file);
	    workbook.close();
	    file.close();
	    
	    System.out.println("Excel Created--");

	}

}
