package in.vamsoft.threadtask;

public class DeamonThread1 extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 15; i++) {
      System.out.println("This is The deamon thread" + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}
