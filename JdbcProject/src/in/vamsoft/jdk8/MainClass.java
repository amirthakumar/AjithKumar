package in.vamsoft.jdk8;

interface I1
{
  public default void m()
  {
    System.out.println("I1");
  }
}
interface I2
{
  public default void m()
  {
    System.out.println("I2");
  }
}

public class MainClass implements I1,I2{
  
  public static void main(String[] args) {
    
  MainClass mc=new MainClass();
  mc.m();
  
  
}

  @Override
  public void m() {
    
    I1.super.m();
  }

  
}