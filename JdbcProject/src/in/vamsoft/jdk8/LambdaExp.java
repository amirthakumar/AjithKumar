package in.vamsoft.jdk8;

class I4 implements Runnable
{

  @Override
  public void run() {
    // TODO Auto-generated method stub
    
  }
  
}


public class LambdaExp {

  public static void main(String[] args) {
    
    Thread th2=new Thread(new I4());
    th2.start();
    Runnable runnable=()-> {
      System.out.println("Hello");
      System.out.println("Ajith");
    };
    Thread th=new Thread(runnable);
    th.start();
  }
}
