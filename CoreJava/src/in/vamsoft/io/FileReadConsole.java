package in.vamsoft.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FileReadConsole {

  public static void main(String[] args) throws IOException {
    
    String option;
    BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
    do
    {
      System.out.println("Please Enter your Name");
      String name=bufferedReader.readLine();
      System.out.println("Hello"+name);
      System.out.println("Do yo Want to continue or quit");
      option=bufferedReader.readLine();
    }while(option.equalsIgnoreCase("Continue"));
    bufferedReader.close();
  }
}
