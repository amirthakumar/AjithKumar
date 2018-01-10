package in.vamsoft.corejava;

public class C extends B {

  public void m2() {
    System.out.println("C");

  }

  public void m3() {
    System.out.println("c2");
  }

  public static void main(String[] args) {
    B ob = new C();
    ob.m2();
  }
}
