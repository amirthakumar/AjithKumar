package in.vamsoft.sample;

public class Student {

  private String name;
  private double salary;

  

  public Student(String name, double salary) {
    super();
    this.name = name;
    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  
  
}
