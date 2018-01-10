package in.vamsoft.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareStatementUse {

  /**
   * @param args
   *          use to pass the command line agruments.
   */
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    Connection con = DbConnection.getConnection();
    PreparedStatement prepare;
    String choice = null;
    try {
      prepare = con.prepareStatement("insert into newtable123 values (?,?)");
      do {
        System.out.println("Please Enter the employee ID");
        prepare.setInt(1, s.nextInt());
        System.out.println("Please Neter the employee Name");
        prepare.setString(2, s.next());
        prepare.executeUpdate();
        System.out.println("Do you want to continue");
        choice = s.next();
      } while (choice.equalsIgnoreCase("Yes"));

    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      s.close();
      DbConnection.closeConnection();
    }

  }

}
