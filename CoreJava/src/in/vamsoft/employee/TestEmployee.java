package in.vamsoft.employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestEmployee {
  public static void main(String[] args) {
    
    Scanner s=new Scanner(System.in);
    Map<Integer, Employee> map=new HashMap<>();
    map.put(101, new Employee("Ajith", 20000, "Chennai"));
    map.put(102, new Employee("usha" , 25000, "Tuti"));
    map.put(103, new Employee("Shebi", 30000, "NagerKovil"));
    map.put(104, new Employee("Sudha", 35000, "Trichy"));
    map.put(101, new Employee("adcc", 20000, "Chennai"));
    System.out.println("Enter The Number U want to perform Operation");
    System.out.println("--------------------------------------------");
    System.out.println("Press 1 for Display,Press 2 for Add,Press 3 for Remove");
    System.out.println("------------------------------------------------------");
    //System.out.println(map);
    int number=s.nextInt();
    
    switch(number)
    {
      case 1:
      {
        System.out.println("Enter the Employee Id u want to display");
        System.out.println(map.get(s.nextInt()));
        break;
      }
      case 2:
      {
        System.out.println("Enter The Details of The new Employee");
        System.out.println("Enter the Employee Id");
        int id=s.nextInt();
        System.out.println("Enter the Employee Name");
        String name=s.next();
        System.out.println("enter the Salary");
        double sal=s.nextDouble();
        System.out.println("enter the City");
        String city=s.next();
        map.put(id, new Employee(name, sal,city));
        System.out.println(map.get(s.nextInt()));
        break;
      }
      case 3:
      {
        System.out.println("Enter The Employee Id U want to remove");
        System.out.println(map.remove(s.nextInt()));
        break;
      }
      case 4:
      {
        System.out.println("Enter the EmployeeId u want to edit :");
        System.out.println("-------------------------------------");
        int empIdforchange=s.nextInt();
        Employee e=map.get(empIdforchange);
        System.out.println(map.get(e));
        System.out.println("Please enter the name");
        String changeName=s.next();
        Employee e1=new Employee(changeName, 22222, "asgjdf");
        map.put(empIdforchange, e1);
        System.out.println(map);
        
      }
    }
    s.close();
   
    
    
    
    
    
  }

}
