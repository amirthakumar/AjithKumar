package in.vamsoft.test;

public class ConstructorSample {

  public ConstructorSample()
  {
    
  }
  public ConstructorSample(ConstructorSample sa)
  {
    System.out.println("Hi");
  }
  public static void main(String[] args) {
    
    ConstructorSample samp1=new ConstructorSample();
    
    ConstructorSample samp=new ConstructorSample(samp1);
  }
}
