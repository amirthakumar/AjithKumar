package in.vamsoft.corejava;

public class Sample2 {

  public static void main(String[] args) {
    try {
      int a=Integer.parseInt(args[0]);
      int b=Integer.parseInt(args[1]);
      System.out.println(a/b);
      
    }catch(ArithmeticException|ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Give 2 values"+e.getMessage());
    }
  }
}
