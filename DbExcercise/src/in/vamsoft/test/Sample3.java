package in.vamsoft.test;

import java.io.Console;

public class Sample3 {

  public static void main(String[] args) {
    Console cnsl = null;
    String alpha = null;

    try {

      // creates a console object
      cnsl = System.console();

      System.out.println(cnsl);
      // if console is not null
      if (cnsl != null) {

        // read line from the user input
        System.out.println("Please Type Something ");
        alpha = cnsl.readLine();

        // prints
        System.out.println("Name is: " + alpha);

        // read password into the char array
        System.out.println("Please Enter The Password ");
        char[] pwd = cnsl.readPassword();
        System.out.println("OutSide For Loop "+String.valueOf(pwd));
        for (char a : pwd) {
          
          String s=String.valueOf(a);
          // prints
          System.out.println("Password is: " + pwd);
        }
      } else {
        System.out.println("Console is Null ");
      }

    } catch (Exception ex) {

      // if any error occurs
      ex.printStackTrace();
    }
  }
}