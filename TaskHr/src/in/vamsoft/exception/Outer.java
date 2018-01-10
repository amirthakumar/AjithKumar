package in.vamsoft.exception;

public class Outer {

  private int n= 1;

  class Inner {
    public void display() {
      System.out.println("Inner Class" + n);
    }

  }

  public void print() {
    System.out.println("Print the Message");
  }

  /**
   * @param args used to get values.
   */
  public static void main(String[] args) {

    Outer o = new Outer();
    Outer.Inner i = o.new Inner();
    o.print();
    i.display();

  }
}
