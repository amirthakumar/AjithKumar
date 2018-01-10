package com.exercise.domain;

public class Manager extends Employee {
  private String depName;
  private Employee staff[];
  //private int employeeCoun=0;
  Employee emp;
  

  public Manager(int empId, String name, String ssn, double salary, String depName) {
    super(empId, name, ssn, salary);
    this.depName = depName;
    staff=new Employee[20];
    
  }

  public String getDepName() {
    return depName;
  }
  public boolean findEmployee(Manager man1) {
    // TODO Auto-generated method stub
    if(this.getEmpId()==emp.getEmpId())
    {
      System.out.println("Manager.findEmployee()");
      return true;
    }

    return true;
  }
  public boolean addEmployee(Manager man1) {
    // TODO Auto-generated method stub
    if(findEmployee(man1)==true)
    {
      staff[0]=emp;
      //staff=this.staff;
      
      }
    return true;
      
    }
   
  
  
  }
  

