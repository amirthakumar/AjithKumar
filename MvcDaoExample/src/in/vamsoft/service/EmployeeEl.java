package in.vamsoft.service;

import java.time.LocalDate;

public class EmployeeEl {

  int empId;
  String empName;
  double salary;
  LocalDate doj;
  int deptId;
  Address address;
  
  public EmployeeEl(int empId, String empName, double salary, LocalDate doj, int deptId, Address address) {
    super();
    this.empId = empId;
    this.empName = empName;
    this.salary = salary;
    this.doj = doj;
    this.deptId = deptId;
    this.address = address;
  }
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
  public Address getAddress() {
    return address;
  }
  public void setAddress(Address address) {
    this.address = address;
  }
  
}
