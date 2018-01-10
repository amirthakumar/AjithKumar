package in.vamsoft.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Sample5 {

  static int a;
  int b;
  static
  {
    System.out.println("Static block");
  }
  {
    System.out.println("Initialization block");
  }
  public void runFirst()
  {
    
  }
  public static void main(String[] args) {
    
    Sample5 ob=new Sample5();
    Class<? extends Sample5> c=ob.getClass();
    Method m[]=c.getDeclaredMethods();
    for(Method m1:m)
    {
      System.out.println(m1.getName());
    }
    Field f[]=c.getDeclaredFields();
    for(Field f1:f)
    {
      System.out.println(f1.getName());
    }
    
  }
  public void run()
  {
    
  }
  public int display()
  {
    return a;
    
  }
  {
    System.out.println("Initialization block 1");
  }
  

}
