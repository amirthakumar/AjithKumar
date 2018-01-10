package in.vamsoft.task;

public class Employee implements Comparable<Employee>{
  int empId;
  String name;
  double salary;
  public Employee(int empId, String name, double salary) {
    super();
    this.empId = empId;
    this.name = name;
    this.salary = salary;
  }
  public int getEmpId() {
    return empId;
  }
  public void setEmpId(int empId) {
    this.empId = empId;
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
  @Override
  public int compareTo(Employee o) {
    // TODO Auto-generated method stub
    return 0;
  }
  @Override
  public String toString() {
    return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
  }
  
  
  

}
