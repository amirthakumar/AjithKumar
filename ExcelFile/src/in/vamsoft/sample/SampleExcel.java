package in.vamsoft.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class SampleExcel {

  public static void main(String[] args) {

    try {
      HSSFWorkbook wb = new HSSFWorkbook();

      HSSFSheet sheet = wb.createSheet();
      HSSFRow row = sheet.createRow(0);
      HSSFCell cell = row.createCell(0);
      cell.setCellValue("Ajith Kumar");

      wb.write(new FileOutputStream("Sample.xls"));

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }
}
