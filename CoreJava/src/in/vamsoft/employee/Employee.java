package in.vamsoft.employee;

public class Employee {
  
  int empId;
  String name;
  double salary;
  String city;
  public Employee(String name, double salary, String city) {
    super();
    this.name = name;
    this.salary = salary;
    this.city = city;
  }
  @Override
  public String toString() {
    return "Employee [name=" + name + ", salary=" + salary + ", city=" + city + "]";
  }
  
  
  

}
