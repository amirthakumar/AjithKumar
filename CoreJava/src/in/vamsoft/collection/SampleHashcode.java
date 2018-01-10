package in.vamsoft.collection;

import java.util.Comparator;
import java.util.TreeSet;

class Exam
{
  int a=11;
}
public class SampleHashcode implements Comparator<SampleHashcode> {

  int a=10;
  
  public static void main(String[] args) {
    
    /*Student s=new Student(1, "Ajith", 100);
    Student s1=new Student(2, "Kumar", 56);
    Student s2=new Student(3, "Ak", 78);
    */
    Exam e=new Exam();
    SampleHashcode s=new SampleHashcode();
    TreeSet<Object> s1=new TreeSet<>();
    
  }

  @Override
  public int compare(SampleHashcode o1, SampleHashcode o2) {
    
    if(o1.a<o2.a)
      return -1;
    else if(o1.a>o2.a)
    {
      return 1;
    }
    else
    {
      return 0;
    }
  }
  
}
