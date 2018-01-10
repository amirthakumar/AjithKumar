package in.vamsoft.threadtask;

public class Bank implements Runnable{

  Account acc;
  double amount;
  public Bank(Account acc, double amount) {
    super();
    this.acc = acc;
    this.amount = amount;
  }
  @Override
  public void run() {
    // TODO Auto-generated method stub
    System.out.println(Thread.currentThread().getName()+" "+acc.getBalance());
    synchronized (acc) {
      
    acc.withdraw(amount);
    }
  }
  public static void main(String[] args) {
    Account acc=new Account(10000);
    Bank b=new Bank(acc, 5000);
    Bank b1=new Bank(acc, 6000);
    Thread t=new Thread(b);
    Thread t1=new Thread(b1);
    t.start();
    t1.start();
  }
}
