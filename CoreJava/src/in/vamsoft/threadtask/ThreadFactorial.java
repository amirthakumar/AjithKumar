package in.vamsoft.threadtask;

import java.util.Scanner;

class Producer extends Thread {
  Consumer cons;
  int number;

  public Consumer getCons() {
    return cons;
  }

  public void setCons(Consumer cons) {
    this.cons = cons;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  @Override
  public void run() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter The Number :");
    number = s.nextInt();
    synchronized (cons) {
      cons.notify();
    }s.close();
  
  }
}

public class ThreadFactorial extends Thread {

  public static void main(String[] args) {

    Producer p = new Producer();
    Consumer c = new Consumer();
    p.setCons(c);
    c.setProd(p);
    p.start();
    c.start();
    

  }

}
