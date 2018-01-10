package in.vamsoft.threadtask;

class MyThread extends Thread{
  @Override
  public void run() {
    for (int i = 0; i < 15; i++) {
      System.out.println("User Thread" + i);
    }
  }
}
public class DaemonThread  {
 public static void main(String[] args) {
    MyThread dm = new MyThread();
    DeamonThread1 dm1 = new DeamonThread1();
    dm1.setDaemon(true);
    dm.start();
    dm1.start();
  }

}
