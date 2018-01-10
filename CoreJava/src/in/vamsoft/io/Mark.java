package in.vamsoft.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Mark {

  public static void main(String[] args) {
    
    try(InputStream bInput=new BufferedInputStream(new 
        FileInputStream("/home/vamsoft/Desktop/Abcd"),1);)
    {
    System.out.println("Charecters Printed");
    System.out.println((char)bInput.read());
    System.out.println((char)bInput.read());
    bInput.mark(8);
    System.out.println("Mark is Invoked");
    System.out.println((char)bInput.read());
    System.out.println((char)bInput.read());
    System.out.println((char)bInput.read());
    System.out.println((char)bInput.read());
    System.out.println((char)bInput.read());
    System.out.println((char)bInput.read());
    System.out.println((char)bInput.read());
    System.out.println((char)bInput.read());
    if(bInput.markSupported())
    {
      bInput.reset();
      System.out.println("Reset is Invoked");
      System.out.println((char)bInput.read());
      System.out.println((char)bInput.read());
      
    }
    else
    {
      System.out.println("The InputStream doesn't support reset");
    }
      bInput.close();
  
  } catch (FileNotFoundException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  } catch (IOException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  }
  }
  
}
