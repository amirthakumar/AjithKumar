package in.vamsoft.threadtask;

public class ThreadTask {

  public static void main(String[] args) throws InterruptedException {
    Runnable r=new Factorial();
    Thread t=new Thread(r);
    t.start();
    Runnable r1=new Fibonacci();
    Thread t1=new Thread(r1);
    t1.start();
    t.join();
    t1.join();
    System.out.println("Main Method");
    Runnable r2=new SleepExm();
    Thread t2=new Thread(r2);
    t2.start();
    t2.setPriority(10);
    
  }
}
