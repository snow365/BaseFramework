package com.dfw.framework.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.TempFile;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

public class ExcelUtils {

	/***
	 * 使用SXSSFWorkbook写入大量数据的excel。
	 * @return 返回生成的excel路径
	 */
	public static String WriteExcel()
	{
		Workbook workbook = new SXSSFWorkbook();//最重要的就是使用SXSSFWorkbook，表示流的方式进行操作
        Sheet sheet = workbook.createSheet();
        int rows = 10;
        int cols = 20;
        for(int row = 0;row < rows;row++) {
            Row writeRow = sheet.createRow(row);
            for(int col = 0;col < cols;col++) {
                org.apache.poi.ss.usermodel.Cell cell = writeRow.createCell(col);
                //cell.setCellStyle(cellStyle);
                cell.setCellValue(row + "-" + col);
            }
        }
        FileOutputStream stream = null;
        File tmpExcel = null;
		try {
			tmpExcel = File.createTempFile(String.valueOf(System.currentTimeMillis()), ".xlsx");
			stream = new FileOutputStream(tmpExcel);
			workbook.write(stream);//最终写入文件
	        stream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
		return tmpExcel.getAbsolutePath();
	}
	public static void main(String[] args) {
		
		System.out.println(ExcelUtils.WriteExcel());
		
	}

}
