package in.vamsoft.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author vamsoft.
 *
 */
public class Sample1 {

  public void display()
  {
    
  }
  /**
   * @param args used to get command line arguments .
   */
  public static void main(String[] args) {

    try {
      Class.forName("oracle.jdbc.OracleDriver");
      Connection con = DriverManager.getConnection(
          "jdbc:oracle:thin:@192.168.10.77:1521:XE", "hr", "password");
      Statement st1 = con.createStatement();
      ResultSet rs1 = st1.executeQuery("select empid,fname,salary as Salary from empcopy");
      while (rs1.next()) {
        System.out.println(rs1.getInt(1) + "\t" + rs1.getString(2) + "\t" + rs1.getDouble(3));
      }

    } catch (ClassNotFoundException e) {

      System.err.println("Please Check The Jar File" + e);

    } catch (SQLException e) {

      System.err.println("Connection IS Not Established" + e);

    }

  }

}
