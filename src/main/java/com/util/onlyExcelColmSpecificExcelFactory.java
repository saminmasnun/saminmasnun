package com.util;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class onlyExcelColmSpecificExcelFactory  {
	
static	XSSFWorkbook workbook;

	public static  ArrayList<String>ReadcolumValue (int column, String path) throws Exception{

		ArrayList<String> columValue =new ArrayList<String>();
		
		FileInputStream file= new FileInputStream(path);
	
		workbook = new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		int totalrow=sheet.getLastRowNum();
		
		for(int i=0;i<=totalrow;i++){
			
			Row row=sheet.getRow(i);
			if(row != null){
				int totalcolumn=row.getLastCellNum();
				
				for(int colIndex=0;colIndex<=totalcolumn;colIndex++){
					if(colIndex==column){
						Cell cell=row.getCell(colIndex);
						if(cell!=null){
						DataFormatter df=new DataFormatter();
						columValue.add(df.formatCellValue(cell));
						
						break;	
						}
					}
				}
			}
		}
		
	//	System.out.println(columValue);
		return columValue;
		
		
	}
	

}
