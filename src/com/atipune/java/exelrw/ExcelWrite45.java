package com.atipune.java.exelrw;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.ObjectData;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite45 {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Raje");
		
		Object[][] testData = {
				{"Name","Age","City","Emp id"},
				{"Nanda","26","Pune",12},
				{"Anita","23","Mumbai",86},
				{"Mansi","21","Abad",46},
				{"Monali","26","Pune",78}
					
				};
		int rows= testData.length;
		int cols= testData[0].length;
		
		for(int r=0;r<rows;r++)
		{
			XSSFRow row=sheet.createRow(r);
			{
				for (int c = 0; c < cols; c++) {
					XSSFCell cell=row.createCell(c);
					Object test=testData[r][c];
					if(test instanceof String) {
						cell.setCellValue((String)test);
					}
					
					if(test instanceof Integer) {
						cell.setCellValue((Integer)test);
					}
				}
			}
			
		FileOutputStream output=new FileOutputStream("D:\\java22\\Java_Basics\\System78.xlsx");
		workbook.write(output);
		output.close();
		}
		
		
	}

}
