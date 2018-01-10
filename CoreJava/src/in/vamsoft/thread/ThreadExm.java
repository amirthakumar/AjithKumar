package in.vamsoft.thread;

public class ThreadExm {

  public static void main(String[] args) {
    ThreadExt th=new ThreadExt();
    th.setName("Aji");
    th.setPriority(1);
    th.start();
    
    ThreadExt th1=new ThreadExt();
    th1.setName("Kumar");
    th.setPriority(10);
    th1.start();
    
    
    
  }
}
