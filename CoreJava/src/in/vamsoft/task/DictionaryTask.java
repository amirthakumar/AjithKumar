package in.vamsoft.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTask {

  public static void main(String[] args) {
 
    Map<String, String> m=new HashMap<>();
    m.put("Able", "having the power, skill");
    m.put("Accept", "consent to receive or undertake");
    m.put("Anoy" , "to disturb or irritate");
    Scanner s=new Scanner(System.in);
    while(true) {
    System.out.println("Please Enter the Word That u want to search");
    System.out.println("-------------------------------------------");
    System.out.println(m.get(s.next()));
    s.close();
    }
  }
}
