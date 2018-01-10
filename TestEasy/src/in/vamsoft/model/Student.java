package in.vamsoft.model;

public class Student {

  String name;
  String password;

  public Student(String name, String password) {
    super();
    System.out.println("Student.Student()");
    this.name = name;
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "Student [name=" + name + ", password=" + password + "]";
  }

}
