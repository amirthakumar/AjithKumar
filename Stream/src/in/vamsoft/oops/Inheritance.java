package in.vamsoft.oops;

interface samp
{
  public void inherit();
  
    
  
  
}
abstract class Sample1 implements samp
{
  public void print()
  {
    System.out.println("print method");
  }

 
}
abstract class Sample2 extends Sample1 
{
  public void display()
  {
    System.out.println("display");
  }
}
public  class Inheritance extends Sample2{


  int a;
  @Override
  public void inherit() {
    // TODO Auto-generated method stub
    
  }

    public static void main(String[] args) {
      
      
      
      
    }
  }
  

