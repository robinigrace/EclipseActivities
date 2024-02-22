package org.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static TakesScreenshot tk;
	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void closeBrowser() {
		driver.close();
	}
	public static  void maxWindow() {
		driver.manage().window().maximize();
	}
	public static String pageTitle() {
		String titleName = driver.getTitle();
		return titleName;
	}
	public static String pageUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void btnClick(WebElement element) {
		element.click();
	}
	public static void fillTextBox(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void clickDouble(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element).perform();
	}
	public static void dragDrop(WebElement start,WebElement end) {
		a=new Actions(driver);
		a.dragAndDrop(start, end).perform();
	}
	public static void copy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}
	public static void paste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}
	public static void takeSnap(String picName) throws IOException {
		tk =(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\workspace\\Maven2Pm\\Screenshots\\"+picName+".png");
		FileUtils.copyFile(src, des);
	}
	
	public static String readFromExcel(String sheetName,int rowNo,int cellNo) throws IOException {
		File f = new File("D:\\workspace\\Maven2Pm\\ExternalFiles\\SampleData.xlsx");
		FileInputStream fin = new FileInputStream(f);
		
		Workbook book = new XSSFWorkbook(fin);
		
		Sheet sh = book.getSheet(sheetName);
		
		Row r = sh.getRow(rowNo);
		
		Cell c = r.getCell(cellNo);
		
		int type = c.getCellType();
		String name ="";
		if (type ==1) {
			 name = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date da = c.getDateCellValue();
			SimpleDateFormat sin = new SimpleDateFormat("dd-MMM,yyyy");
			 name = sin.format(da);
		}else {
			double d = c.getNumericCellValue();
			long l =(long)d;
			 name = String.valueOf(l);
		}
		return name;
	}
	public static void date() {
		Date d = new Date();
		System.out.println(d);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
