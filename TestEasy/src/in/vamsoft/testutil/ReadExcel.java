package in.vamsoft.testutil;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

  public static HSSFCell readQuestion(int rowNum, int quesNum) {
    HSSFWorkbook wb;
    HSSFSheet sheet;
    HSSFRow row;
    HSSFCell cell = null;

    try {
      wb = new HSSFWorkbook(new FileInputStream("/home/vamsoft/Desktop/sample.xls"));
      sheet = wb.getSheetAt(0);
      row = sheet.getRow(rowNum);
      cell = row.getCell(quesNum);
      System.out.println(cell);

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return cell;
  }

  public static String readAnswer(int rowNum, int quesNum) {
    HSSFWorkbook wb;
    HSSFRow row;
    HSSFCell cell = null;
    String answer = null;

    try {
      wb = new HSSFWorkbook(new FileInputStream("/home/vamsoft/Desktop/sample.xls"));

      HSSFSheet sheet = wb.getSheetAt(0);
      row = sheet.getRow(rowNum);
      cell = row.getCell(quesNum);
      answer = cell.getStringCellValue();
      // Iterator<Cell> cell1=row.cellIterator();

    } catch (IOException e) {  
      // TODO Auto-generated catch block 
      e.printStackTrace();  
    }
    return answer; 
  }

  public static int lastRow(int sheetNum) {

    HSSFWorkbook wb;
    int lastRowNum = 0;

    try {
      wb = new HSSFWorkbook(new FileInputStream("/home/vamsoft/Desktop/sample.xls"));
      HSSFSheet sheet = wb.getSheetAt(sheetNum);
      lastRowNum = sheet.getLastRowNum();

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return lastRowNum;

  }

  public static int lastCell(int rowNum) {

    HSSFWorkbook wb;
    HSSFRow row;
    int lastCellNum = 0;

    try {
      wb = new HSSFWorkbook(new FileInputStream("/home/vamsoft/Desktop/sample.xls"));
      HSSFSheet sheet = wb.getSheetAt(0);
      row = sheet.getRow(rowNum);
      lastCellNum = row.getLastCellNum();

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return lastCellNum;

  }

}
