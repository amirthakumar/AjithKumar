package in.vamsoft.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class EmployeeTest {
  public static void main(String[] args) {
    Employee e=new Employee(1, "zAjith", 50000);
    Employee e1=new Employee(2, "Kumar",25000);
    Employee e2=new Employee(3, "Ak", 5000);
    List<Employee> l=new ArrayList<>();
    l.add(e);
    l.add(e1);
    l.add(e2);
    
    System.out.println(l);
    NameComparator nc=new NameComparator();
    //int a=nc.compare(e, e1);
    Collections.sort(l,nc);
    System.out.println(l);
    
    
    
  }


}
