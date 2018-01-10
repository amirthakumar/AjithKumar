package in.vamsoft.exception;

public class BuildInException {

  /**
   * @exception ArithmeticException
   *              some of the Build In exception.
   * @param args
   *          it is used for command line arguement.
   */
  public static void main(String[] args) {

    try {

      int n = 10;
      int m = 0;
      int o = n / m;

      System.out.println(o);

    } catch (ArithmeticException a) {

      System.err.println("Please Enter the valid denominator more than 0");
    }
    try {
      int[] a = { 1, 2, 3 };
      for (int i = 1; i <= a.length; i++) {
        System.out.println(a[i]);
      }
    } catch (ArrayIndexOutOfBoundsException e) {

      System.err.println("The Array is Out Of bound Please check the code");
    } catch (Exception a) {
      System.err.println(a);
    }
  }

}
