package org.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleWrite {
	public static void main(String[] args) throws IOException {
		//write or update in already existing file 
		File f = new File("D:\\workspace\\Maven2Pm\\ExternalFiles\\Data.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		//getting complete workbook
		Workbook book = new XSSFWorkbook(fin);
		
		//already created  sheet
		Sheet sh = book.getSheet("Login");
		
		//create a row
		Row r = sh.getRow(0);
		
		//create a cell
		Cell c= r.getCell(0);
	
		String s = c.getStringCellValue();
	
		if (s.startsWith("User")) {
			
			c.setCellValue("Email");
			
		} else {
			
			c.setCellValue("Phone no");
			
		}
		FileOutputStream fo = new FileOutputStream(f);
		
		book.write(fo);
		
		System.out.println("Written...!!!");
	}
}
