package in.vamsoft.threadtask1;

public class Thread3 extends Thread{

  int counter=100;
  @Override
  public void run() {
   
    for (int i = counter; i <=1000; i+=100) {
      
      System.out.println("Thread3 "+i);
    }
  }
}
