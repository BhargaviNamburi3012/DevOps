package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D10WriteToExcel {
	String fpath="D:\\STAR AGILE\\MyFirst.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
  @Test
  public void writeDataToExcel() {
	  row=sheet.createRow(0); //create 1st row
	  cell=row.createCell(0); //create 1st cell in 1st row
	  cell.setCellValue("Bhargavi");
	  
  }
  @BeforeTest
  public void beforeTest() throws FileNotFoundException  {
	  file=new File(fpath);
	  fos=new FileOutputStream(file);
	  wb=new XSSFWorkbook();
	  sheet=wb.createSheet("My Sheet");
  }

  @AfterTest
  public void afterTest() throws IOException {
	    wb.write(fos);			//Write the data to Excel file
		wb.close();
		fos.close();
  }

}
