package in.vamsoft.corejava;

public class Sample1 {

  public static void main(String[] args) {
    try {
    int a=10;
    int b=0;
    int c=a/b;
    System.out.println("Line");
    System.out.println("Line1");
    }catch (ArithmeticException e) {
      System.err.println(e);
      System.err.println(e.getMessage());
      System.err.println(e.getStackTrace());
      e.printStackTrace();
    }
    System.out.println(".......................");
    System.out.println("Line2");
  }
}
