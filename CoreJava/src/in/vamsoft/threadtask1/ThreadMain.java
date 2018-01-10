package in.vamsoft.threadtask1;

public class ThreadMain {

  public static void main(String[] args) {
    Thread1 th1=new Thread1();
    Thread2 th2=new Thread2();
    Thread3 th3=new Thread3();
    th1.start();
    th2.start();
    th3.start();
    
  }
}
