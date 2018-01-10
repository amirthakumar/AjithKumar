package in.vamsoft.exception;

public class ExceptionTest {

  
  public static void main(String[] args) {
 
    int i=18;
    if(i<=18)
    {
      try {
        throw new MyException("The Value is Invalid");
      } catch (MyException e) {
       
        System.err.println(e);
        
        
      }
    }
    
    
  }
  
  
}
