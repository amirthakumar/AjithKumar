package in.vamsoft.threadtask;

public class SleepExm implements Runnable {

  @Override
  public void run() {
    // TODO Auto-generated method stub
    for (int i = 0; i <=5; i++) {
      System.out.println("Sleep"+ i);
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
    
  }

  
}
