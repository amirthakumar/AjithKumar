package in.vamsoft.threadtask2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File2 extends Thread {

  String filename;
  
  public File2(String file) {
  
    this.filename=file;
  }

  @Override
  public void run() {
  
    Scanner s;
    try {
      s = new Scanner(new File(filename));
    
    while(s.hasNextInt())
    {
      int num=s.nextInt();
      System.out.println("This Output is From Thread2 :"+num);
      try {
        sleep(3000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }s.close();
    } catch (FileNotFoundException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
    
  }
}
