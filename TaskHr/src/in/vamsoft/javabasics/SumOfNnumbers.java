package in.vamsoft.javabasics;

public class SumOfNnumbers {

  public static void main(String[] args) {
    
    int n=Integer.parseInt(args[0]);
    int sum=0;
    for(int i=1;i<=n;i++)
    {
      sum+=i;
    }
    System.out.println("The Sum Of"+n+" Is "+sum);
  }
}
