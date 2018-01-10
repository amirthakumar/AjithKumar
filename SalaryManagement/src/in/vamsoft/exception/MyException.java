package in.vamsoft.exception;

public class MyException extends Exception {

  private static final long serialVersionUID = 1L;
  String message;

  public MyException(String message) {
    super();
    this.message = message;
  }

  @Override
  public String toString() {
    return "MyException [message=" + message + "]";
  }
  
  
  
  
  
  
}
