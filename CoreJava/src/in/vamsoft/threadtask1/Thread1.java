package in.vamsoft.threadtask1;

public class Thread1 extends Thread{

  int counter=5;
  @Override
  public void run() {
   
    for(int i=counter;i<=100;i+=5)
    {
      System.out.println("Thread1 : "+i);
    }
  }
}
