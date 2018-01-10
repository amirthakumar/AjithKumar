package in.vamsoft.corejava;

public interface Maggy {
  public default void eat()
  {
    System.out.println("Maggy.eat()");
  }
  public void cook();
  
}
