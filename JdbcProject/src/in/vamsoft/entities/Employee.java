package in.vamsoft.entities;

import java.time.LocalDate;

public class Employee {

  int empId;
  String empName;
  double salary;
  LocalDate doj;
  int deptId;
  public int getEmpId() {
    return empId;
  }
  
  public void setEmpId(int empId) {
    this.empId = empId;
  }
  public String getEmpName() {
    return empName;
  }
  public void setEmpName(String empName) {
    this.empName = empName;
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
  
  public Employee(int empId, String empName, double salary, LocalDate doj2, int deptId) {
    super();
    this.empId = empId;
    this.empName = empName;
    this.salary = salary;
    this.doj = doj2;
    this.deptId = deptId;
  }

  @Override
  public String toString() {
    return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", doj=" + doj + ", deptId="
        + deptId + "]";
  }
  
  
}
