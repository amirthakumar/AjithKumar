package in.vamsoft.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnum {

  /**
   * @param args
   *          get the values.
   */
  public static void main(String[] args) {

    Vector<Integer> vect = new Vector<>(3);
    vect.add(1);
    vect.add(2);
    vect.add(3);
    vect.add(4);
    vect.add(5);
    vect.add(6);
    Enumeration<Integer> values = vect.elements();
    while (values.hasMoreElements()) {
      System.out.println(values.nextElement());

    }
  }

}
