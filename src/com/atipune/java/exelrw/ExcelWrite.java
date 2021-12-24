package com.atipune.java.exelrw;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		
		
		XSSFWorkbook workbook = new XSSFWorkbook ();
		

		XSSFSheet sheet = workbook.createSheet("shubh");
		
		Object [][] testdData = {       
				{"name","age","city","emp id"}, 
				{"shubham","24","A.Bad",12},  
				{"Rajendra","28","PP",12},
				{"Shub","24","latur",10},
				
				};
	
	int rows = testdData.length; //4
	int cols = testdData[0].length; //4
	
	for (int r = 0; r < rows; r++) 
	{
		XSSFRow row = sheet.createRow(r);
		for (int c = 0; c < cols; c++) 
		{
			XSSFCell cell = row.createCell(c);
			Object test =testdData[r][c];
            if (test instanceof String ) {
				cell.setCellValue((String)test);
			}
            if (test instanceof Integer) {
            	cell.setCellValue((Integer)test);
            }
		}
	}
 
	FileOutputStream output = new FileOutputStream("D:\\java22\\Java_Basics\\System.xlsx");
	workbook.write(output);
	output.close();
	}

}
