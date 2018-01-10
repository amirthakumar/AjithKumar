package in.vamsoft.javabasics;

public class Fibonaci {

  public static void main(String[] args) {
    
    int m=15;
    int n=0;
    int o=1;
    int p=0;
    System.out.print(n+" "+o);
    for(int i=2;i<m;i++)
    {
      p=n+o;
      System.out.println(" "+ p );
      n=o;
      o=p;
    }
  }
}
