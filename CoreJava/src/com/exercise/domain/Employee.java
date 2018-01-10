package com.exercise.domain;

public class Employee {
  
  private int empId;
  private String name;
  private String ssn;
  private double salary;
  public Employee(int empId, String name, String ssn, double salary) {
    super();
    this.empId = empId;
    this.name = name;
    this.ssn = ssn;
    this.salary = salary;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    if(name!=null)
    { 
    this.name = name;
    }
  }
  public int getEmpId() {
    return empId;
  }
  public String getSsn() {
    return ssn;
  }
  public double getSalary() {
    return salary;
  }
  public void raiseSalary(double increase)
  {
    if(increase>0)
    {
      salary+=increase;
    }
  }
  @Override
  public String toString() {
    return "Employee [empId=" + empId + ", name=" + name + ", ssn=" + ssn + ", salary=" + salary + "]";
  }
  
  
  
}
