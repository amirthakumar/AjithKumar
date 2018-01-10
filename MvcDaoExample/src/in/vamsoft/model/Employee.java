package in.vamsoft.model;

import java.io.Serializable;
import java.time.LocalDate;

@SuppressWarnings("serial")
public class Employee implements Serializable {

  private int empId;
  private String name;
  private double salary;
  private LocalDate doj;
  private int deptId;
  public Employee(int empId, String name, double salary, LocalDate doj, int deptId) {
    super();
    this.empId = empId;
    this.name = name;
    this.salary = salary;
    this.doj = doj;
    this.deptId = deptId;
  }
  public Employee() {
    // TODO Auto-generated constructor stub
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
  public LocalDate getDoj() {
    return doj;
  }
  public void setDoj(LocalDate doj) {
    this.doj = doj;
  }
  public int getDeptId() {
    return deptId;
  }
  public void setDeptId(int deptId) {
    this.deptId = deptId;
  }
  @Override
  public String toString() {
    return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", doj=" + doj + ", deptId=" + deptId
        + "]";
  }
  
  
  
  
}
