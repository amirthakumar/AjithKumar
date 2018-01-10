package in.vamsoft.collection;

import java.util.Vector;

public class VectorUse {

  /**
   * @param args
   *          used to get values to parameters .
   */
  public static void main(String[] args) {

    Vector<Integer> vect = new Vector<>();
    vect.add(1);
    vect.add(0, 2);
    vect.add(0, 3);
    System.out.println(vect);

  }

}
