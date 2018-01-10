package in.vamsoft.collectiontask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberFile extends Thread{

  
  int num;
  FactorialFun ff;
  

  public FactorialFun getFf() {
    return ff;
  }

  public void setFf(FactorialFun ff) {
    this.ff = ff;
  }

  public int getNum() {
    
    return num;
  }
  
  public void setNum(int num) {
    
    this.num = num;
  }

  @Override
  public synchronized void run() {
    
    try {
      Scanner s=new Scanner(new File("/home/vamsoft/Desktop/Number.txt"));
      while(s.hasNextInt())
      { 
        
      num=s.nextInt();
      System.out.println(num);
        synchronized (ff) {
         System.out.println("NumberFile.run()");
          ff.notify();
          this.wait();
        }
        
   
        
      }s.close();
    }
   catch (FileNotFoundException | InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    
    
  }
}
