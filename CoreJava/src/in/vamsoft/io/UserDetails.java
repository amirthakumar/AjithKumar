package in.vamsoft.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class UserDetails {
  public static void main(String[] args) throws IOException {
    BufferedReader bReader=new BufferedReader(new InputStreamReader(System.in));
    FileWriter fWriter=new FileWriter("/home/vamsoft/Desktop/Details1.txt",true);
    BufferedWriter bWriter=new BufferedWriter(fWriter);
    BufferedReader bReader1=new BufferedReader(new FileReader("/home/vamsoft/Desktop/Details1.txt"));
    try {
      System.out.println("Please Enter ur Name :");
      String name=bReader.readLine();
      System.out.println("Please Enter your Age :");
      String age=bReader.readLine();
      bWriter.write("Ur Name :"+name);
      bWriter.newLine();
      bWriter.write("Ur Age :"+age);
      bWriter.close();
      String data="";
      while((data=bReader1.readLine())!=null)
      {
        
          
          System.out.println(data);
      }
      bReader1.close();
    } catch (IOException e1) {

      e1.printStackTrace();
    }
    
  }

}
