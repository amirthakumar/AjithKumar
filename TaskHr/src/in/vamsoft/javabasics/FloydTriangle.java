package in.vamsoft.javabasics;

import java.util.Scanner;

public class FloydTriangle {

  /**
   * @param args
   *          used to get arguments from the commandline .
   */
  public static void main(String args[]) {
    int n;
    int num = 1; 
    int c;
    int  d;
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the number of rows of floyd's triangle you want");
    n = in.nextInt();

    System.out.println("Floyd's triangle :-");

    for (c = 1; c <= n; c++) {
      for (d = 1; d <= c; d++) {
        System.out.print(num + " ");
        num++;
      }

      System.out.println();
    }
  }
}