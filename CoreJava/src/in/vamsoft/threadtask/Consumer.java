package in.vamsoft.threadtask;



public class Consumer extends Thread {
  Producer prod;

  public Producer getProd() {
    return prod;
  }

  public void setProd(Producer prod) {
    this.prod = prod;
  }

  @Override
  public void run() {
    try {
      synchronized (this) {
        wait();
      }
      
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    
    int num = prod.getNumber();
    int fact = 1;
    for (int i = 1; i <= num; i++) {
      fact = fact * i;
    }
    System.out.println("Factorial of " + num + " is: " + fact);

  }
}
