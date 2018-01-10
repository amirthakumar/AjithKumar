package in.vamsoft.threadtask1;

public class Thread2 extends Thread{

  int counter=10;
  @Override
  public void run() {
  
  for(int i=counter;i<=100;i+=10)
  {
    System.out.println("Thread2 :"+i);
  }
}
}