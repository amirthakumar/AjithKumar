package in.vamsoft.thread;

public class TestRunnable {
  public static void main(String[] args) {
    RunnableThread r=new RunnableThread();
    Thread t=new Thread(r);
    t.setName("Aji");
    t.start();
    System.out.println(t.getId());
    Thread t1=new Thread(r);
    t1.setName("Ak");
    t1.start();
    System.out.println(t1.getId());
    Thread2 t2=new Thread2();
    Thread t3=new Thread(t2);
    t3.start();
    
  }

}
