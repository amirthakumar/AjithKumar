package in.vamsoft.javabasics;

public class PrimeOrNot {

  /**
   * @param args used for command line arguments.
   */
  public static void main(String[] args) {

    int n = 6;
    int m = n / 2;
    int flag = 0;
    if (n == 0 || n == 1) {
      System.out.println("The Number Is Not Prime ");
    } else {
      for (int i = 2; i <= m; i++) {
        if (n % 2 == 0) {
          System.out.println("The Number is Not Prime ");
          flag = 1;
          break;
        }
      }
      if (flag == 0) {
        System.out.println("The Number is Prime");
      }
    }
  }
}
