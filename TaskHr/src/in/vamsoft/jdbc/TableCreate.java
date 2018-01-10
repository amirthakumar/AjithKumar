package in.vamsoft.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreate {

  public static void main(String[] args) {

    Connection con = DbConnection.getConnection();
    Statement st;
    try {
      st = con.createStatement();
      int n = st.executeUpdate("create table newtable123 (custid1 number(10),custname varchar2(10))");
      if (n > 0) {
        System.out.println("The Table is created");
      }

    } catch (SQLException e) {

      e.getStackTrace();
      System.err.println("The Table is not created Due to some error please check The Code");

    }

  }

}
