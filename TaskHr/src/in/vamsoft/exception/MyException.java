package in.vamsoft.exception;

public class MyException extends Exception {

  String s1;

  public MyException(String s1) {
    super(s1);
    this.s1 = s1;
  }
  
  
  
}
