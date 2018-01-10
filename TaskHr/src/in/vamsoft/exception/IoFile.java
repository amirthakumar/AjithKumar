package in.vamsoft.exception;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoFile {

  public static void main(String[] args) {

    try 
      (BufferedInputStream bis = new BufferedInputStream(
          new FileInputStream("/home/vamsoft/Desktop/File1"));
      
      BufferedOutputStream bos = new BufferedOutputStream(
          new FileOutputStream("/home/vamsoft/Desktop/saveds"));)
      {
      
      int c;
      while ((c = bis.read()) != -1) {
        bos.write(c);
      }
      System.out.println("The File is Written Successfully");
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    

  }

}
