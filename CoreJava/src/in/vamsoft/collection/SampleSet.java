package in.vamsoft.collection;

import java.util.HashSet;
import java.util.Set;

public class SampleSet {
  

  public static void main(String[] args) {
    Set<String> s=new HashSet<>();
    s.add("Ajith");
    s.add("kumar");
    System.out.println(s);
    s.clear();
    System.out.println(s);
    System.out.println(s.add("AK"));
    
    
  }
}
