package xlMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class basicXLOperations {
	
	public boolean readExcel(String filePath, String fileName, String sheetName) {
		boolean flag=false;
		try {
			File fileObject = new File(filePath+"\\"+fileName);
			FileInputStream inputFileStream = new FileInputStream(fileObject);
			Workbook workbookObject = null;
			String fileExeType = fileName.substring(fileName.indexOf("."));
			if(fileExeType.equals(".xls")) {
				workbookObject = new HSSFWorkbook(inputFileStream);
			}
			else if (fileExeType.equals(".xlsx")) {
				workbookObject = new XSSFWorkbook(inputFileStream);
			}
			Sheet sheetObject= workbookObject.getSheet(sheetName);
			int numOfRow = sheetObject.getLastRowNum()-sheetObject.getFirstRowNum();
			for(int i = 0; i<numOfRow+1; i++) {
				
				Row rowData = sheetObject.getRow(i);
				for(int j=0; j<rowData.getLastCellNum(); j++) {
					System.out.println(rowData.getCell(j).getStringCellValue());
				}
			}
			
			flag = true;
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	public boolean writeExcel(String filePath, String fileName, String sheetName, String[] data) {
		boolean flag=false;
		try {
			File fileObject = new File(filePath+"\\"+fileName);
			FileInputStream inputFileStream = new FileInputStream(fileObject);
			Workbook workbookObject = null;
			String fileExeType = fileName.substring(fileName.indexOf("."));
			if(fileExeType.equals(".xls")) {
				workbookObject = new HSSFWorkbook(inputFileStream);
			}
			else if (fileExeType.equals(".xlsx")) {
				workbookObject = new XSSFWorkbook(inputFileStream);
			}
			Sheet sheetObject= workbookObject.getSheet(sheetName);
			int numOfRow = sheetObject.getLastRowNum()-sheetObject.getFirstRowNum();
			Row rowZeroData = sheetObject.getRow(0);
			Row newRow = sheetObject.createRow(numOfRow+1);
			for(int j = 0; j<rowZeroData.getLastCellNum(); j++) {
				Cell newCell = newRow.createCell(j);
				newCell.setCellValue(data[j]);
			}
			
			inputFileStream.close();
			
			FileOutputStream outputFilestream = new FileOutputStream(fileObject);
			
			workbookObject.write(outputFilestream);
			outputFilestream.close();
			flag=true;
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return flag;
		
	}
	
	

}
