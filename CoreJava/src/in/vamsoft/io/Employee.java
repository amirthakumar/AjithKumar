package in.vamsoft.io;

import java.io.Serializable;

public class Employee implements Serializable {

  private static final long serialVersionUID = 1L;
  String name;
  int age;
  
  
  public Employee(String name, int age) {
    super();
    this.name = name;
    this.age = age;
  }


  @Override
  public String toString() {
    return "Employee [name=" + name + ", age=" + age + "]";
  }
  
  
}
