package in.vamsoft.test;

import java.io.Console;

public final class Sample2 {

  
  public static void main(String[] args) {
    
    Runtime r=Runtime.getRuntime();
    System.out.println(r.freeMemory());
    System.out.println(r.totalMemory());
    System.out.println(r.availableProcessors());
    r.gc();
    System.out.println(r.freeMemory());
    Runtime rt=Runtime.getRuntime();
    System.out.println(rt.availableProcessors());
    StringBuffer sb=new StringBuffer();
    
    String s="Ajith";
    Console s1 = System.console();
    char a[]=s1.readPassword("Hi ");
    //char[] a=s1.readPassword(s, 1,2,3);    
    System.out.println(a);
    for(char aa:a)
    {
      System.out.println(aa);
    }
      
  }
  
  
}
