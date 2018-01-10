package in.vamsoft.javabasics;

public class Multiplication {

  public static void main(String[] args) {
    
    try {
    int number=Integer.parseInt(args[0]);
    for(int i=1;i<=20;i++)
    {
      System.out.println(i+"*"+number+""+"="+i*number);
    }
    
  }catch(NumberFormatException nf)
    {
    System.err.println("Please Enter The Valid Number ");
    }
  }
}
