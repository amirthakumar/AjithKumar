package in.vamsoft.oops;

import java.util.Scanner;

public class Sample {

  private String name;
  private double salary;

  public Sample(String name, double salary) {
    super();
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  /**
   * @param args
   *          used to get command line arguements .
   */
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Please Enter the Name");
    String name = s.next();
    Sample ob = new Sample(name, 12000);
    System.out.println(ob.getName());
    System.out.println(ob.getSalary());

  }

}
