package in.vamsoft.io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessExample {

  public static void main(String[] args) {
    try(RandomAccessFile randomAccessFile=new RandomAccessFile("myfile.txt","rw" );) 
    {
      randomAccessFile.write("Hello How Are you?".getBytes());
      randomAccessFile.seek(5);
      int c;
      while((c=randomAccessFile.read())!=-1)
      {
        System.out.print((char)c);
      }
      
      randomAccessFile.seek(randomAccessFile.length());
      randomAccessFile.write("Appending string".getBytes());
      System.out.println();
      randomAccessFile.seek(0);
      while((c=randomAccessFile.read())!=-1)
      {
        System.out.print((char)c);
      }
      
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
