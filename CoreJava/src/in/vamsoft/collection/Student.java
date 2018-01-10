 package in.vamsoft.collection;

import java.util.Comparator;

public class Student implements Comparator<Student> {

  int roll;
  String name;
  int marks;
  
  public Student(int roll, String name, int marks) {
    super();
    this.roll = roll;
    this.name = name;
    this.marks = marks;
  }
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Student other = (Student) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
   
  }
  @Override
  public int compare(Student o1, Student o2) {
    
    if(o1.marks<o2.marks)
    return -1;
    else if(o1.marks>o2.marks)
    {
      return 1;
    }
    else {
      return 0;
    }
  }
  
  
}
