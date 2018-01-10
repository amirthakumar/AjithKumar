package in.vamsoft.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageFileStream {

  public static void main(String[] args) {
    
    
    try(  FileInputStream fileInputStream=new
          FileInputStream("/home/vamsoft/Downloads/White-Rose-Natural-Wallpaper-For-Desktop.jpg");
      FileOutputStream fileOutputStream=new FileOutputStream("/home/vamsoft/Desktop/image.jpg");)
    {  
    int c=0;
      while((c=fileInputStream.read())!=-1)
      {
        fileOutputStream.write(c);
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
