package com.exercise.domain;

public class FindClass {
  int empId;
  String name;
  FindClass arr[];
  static int counter=0;
  public FindClass(int empId, String name) {
    super();
    System.out.println(counter++);
    arr=new FindClass[3];
    if(findEmployee(this)==true)
    {
    this.empId = empId;
    this.name = name;
    arr[counter]=this;
    }
    else
    {
      System.out.println("The Employee Details are Already Stored");
    }
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
  public boolean findEmployee(FindClass fc) {
    
    if(this.getEmpId()==fc.getEmpId())
    {
      System.out.println("This Employee Details Already Registered");
      return false;
    }
    
    return true;
  }
  public boolean addEmployee(FindClass fc) {
    
    if(findEmployee(fc)==true)
    {
      
    }
    {
      arr[counter]=fc;
      //staff=this.staff;
      for(FindClass obj:arr)
      {
        System.out.println(obj.getEmpId()+" "+obj.getName());
      }
      
      }
    return true;
      
  }
  /*@Override
  public String toString() {
    return "FindClass [empId=" + empId + ", name=" + name + "]";
  }
  */
  

}
