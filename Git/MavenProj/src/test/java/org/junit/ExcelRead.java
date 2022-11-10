package org.junit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void main(String[] args) throws IOException {
	
//	To mention the path of the excel file
		File file = new File("C:\\Users\\2047968\\eclipse-workspace\\MavenProj\\src\\test\\resources\\Test.xlsx");
		
//	To Read the cell
		FileInputStream input = new FileInputStream(file);
		
//	To mention type of workbook
		Workbook workbook = new XSSFWorkbook(input);
		
//	To mention the sheet
		Sheet sheet = workbook.getSheet("Sheet1");
		
//	To get the row
		Row row = sheet.getRow(1);
		
//	To get the column
		Cell cell = row.getCell(1);
		
//	To print the column value
		System.out.println(cell);
		
//	To get physical number of rows present in the sheet
		int numberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(numberOfRows);
		
//	To get the physical number of cells present in the sheet
		int numberOfCells = row.getPhysicalNumberOfCells();
		System.out.println(numberOfCells);
		
//	To print one row data
		Row row2 = sheet.getRow(2);
		
		for(int i=0;i<row2.getPhysicalNumberOfCells();i++)
		{
			Cell cell2 = row2.getCell(i);

			System.out.println(cell2);
		}

//	To print all row data
				
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++)
		{
			Row row3 = sheet.getRow(i);
			
			for(int j=0;j<row3.getPhysicalNumberOfCells();j++)
			{
				Cell cell3 = row3.getCell(j);
				System.out.println(cell3);
		
			}
		}
		
	}
}
