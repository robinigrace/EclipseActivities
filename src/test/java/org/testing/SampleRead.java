package org.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleRead {
public static void main(String[] args) throws IOException {
	//1.File location
	File f = new File("D:\\workspace\\Maven2Pm\\ExternalFiles\\SampleData.xlsx");
	
	//2.Read/write a file
	FileInputStream fin =new FileInputStream(f);
	
	//3.Get complete excelsheet
	//Excel------sheet----Row----Cell
	
	//4.create a object for WorkBook interface
	Workbook book = new XSSFWorkbook(fin);
	
	//5.fetch the particular sheet
	Sheet sh = book.getSheet("Login");
	
	//6.To find no of rows
	int numberOfRows = sh.getPhysicalNumberOfRows();
	System.out.println("No of rows : "+numberOfRows);
	//7.To fetch all the values from the sheet
	for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
		
		Row r = sh.getRow(i);
		
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			
			Cell c = r.getCell(j);
			
			//To fetch cell type---getCellType() return type : int
			int type = c.getCellType();
			
			//type==1---String,type==0---numb/date
			if (type ==1) {
				String name = c.getStringCellValue();
				System.out.println(name);
			}else if (DateUtil.isCellDateFormatted(c)) {
				Date da = c.getDateCellValue();
				
				//date---- string
				SimpleDateFormat sin = new SimpleDateFormat("dd MMM yyyy");
				String name = sin.format(da);
				System.out.println(name);
				
			} else {
				double d = c.getNumericCellValue();
				System.out.println(d);
				
				//double-long
				//downcasting
				long lo=(long)d;
				System.out.println(lo);
				
				//long--String
				String name = String.valueOf(lo);
				System.out.println(name);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
}
}
