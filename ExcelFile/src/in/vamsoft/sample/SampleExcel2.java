package in.vamsoft.sample;

import java.io.File;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class SampleExcel2 {

  public static void main(String[] args) {
    

    HSSFWorkbook wb=new HSSFWorkbook();
    HSSFSheet sheet=wb.createSheet();
    HSSFRow row=sheet.createRow(1);
    HSSFCell cell=row.createCell(1);
    System.out.println(cell.getAddress());
    sheet.autoSizeColumn(1);
    try {
      wb.write(new File("Sample3.xlsx"));
    } catch (IOException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
    try {
      wb.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    
    
  }
  
  
}
