package com.exercise.domain;

public class EmployeeTest {
   
   public void printEmployee(Employee emp) {
    // TODO Auto-generated method stub
    System.out.println("Employee Details : "+emp);
 
  }

  public static void main(String[] args) {
    //Engineer eng=new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
    Manager man=new Manager(207, "Barbara Johnson" , "054-12-2367", 109_501.36, "Us Marketing");
    Manager man1=new Manager(201, "Barbara Johnson" , "054-12-2367", 109_501.36, "Us Marketing");
    man1.addEmployee(man1);
    /*Admin admin=new Admin(30, "Bill Monorce", "108-23-6509", 75_002.34);
    Director direct=new Director(12, "Susan wheelar", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);
    EmployeeTest empTest= new EmployeeTest();
    eng.setName("Ajith");
    eng.raiseSalary(2000000000);
    empTest.printEmployee(eng);
    empTest.printEmployee(man);
    empTest.printEmployee(admin);
    empTest.printEmployee(direct);*/
  }
}
