package in.vamsoft.javabasics;

import java.util.Arrays;

public class SortOrder {

  /**
   * @param args
   *          this method is used to sort the numbers.
   */
  public static void main(String[] args) {

    int[] a = { 1, 3, 2, 11, 1 };

    Arrays.sort(a);

    for (int b : a) {
      System.out.println(b);
    }
  }
}
