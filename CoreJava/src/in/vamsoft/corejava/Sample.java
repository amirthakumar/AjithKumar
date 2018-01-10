package in.vamsoft.corejava;

public class Sample {

  int a;
  int b;

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + a;
    result = prime * result + b;
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
    Sample other = (Sample) obj;
    if (a != other.a)
      return false;
    if (b != other.b)
      return false;
    return true;
  }
  public static void main(String[] args) {
    
    Sample s=new Sample();
    System.out.println(s.hashCode());
  }
}
