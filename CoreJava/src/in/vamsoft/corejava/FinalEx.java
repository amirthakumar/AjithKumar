package in.vamsoft.corejava;

public class FinalEx {
  public void divide(int a,int b)
  {
    try {
    System.out.println(a/b);
    }catch(Exception e)
    {
      System.err.println(e.getStackTrace());
    }
    }

  public static void main(String[] args) {
    FinalEx f=new FinalEx();
    f.divide(10, 0);
  }
}
