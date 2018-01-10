package in.vamsoft.sample;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

  public static void main(String[] args) {
    
    try {
      HSSFWorkbook wb=new HSSFWorkbook(new FileInputStream("/home/vamsoft/Desktop/Sample3.xlsx"));
      HSSFSheet sheet=wb.getSheetAt(0);
      HSSFRow row=sheet.getRow(0);
      HSSFCell cell=row.getCell(0);
      System.out.println(cell);
    
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    
  }
}
