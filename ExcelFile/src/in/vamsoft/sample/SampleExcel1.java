package in.vamsoft.sample;

import java.io.File;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class SampleExcel1 {

  public static void main(String[] args) {
    
    HSSFWorkbook wb=new HSSFWorkbook();
    HSSFSheet sheet=wb.createSheet("Ajith Sheet");
    HSSFRow row=sheet.createRow(1);
    HSSFCell cell=row.createCell(1);
    try {
      wb.write(new File("New Sample.xlsx"));
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    
    
  }
  
}
