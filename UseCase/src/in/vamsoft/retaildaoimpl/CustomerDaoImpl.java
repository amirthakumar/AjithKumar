package in.vamsoft.retaildaoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import in.vamsoft.ratailentities.Product;

public class CustomerDaoImpl {

  static Connection con = DbConnection.getConnection();
  static PreparedStatement prepare;
  public static final String GET_CUS_ID = "select max(customerid) from customeraji";
  public static final String CHECK_CUS_ID = "select customerid from customeraji where customerid=?";

  public void bookProduct(Product obj) {

  }

  /**
   * @return last customerId in the table.
   */
  public static int getLastCustomerId() {

    Statement st;
    try {
      st = con.createStatement();

      ResultSet rs = st.executeQuery(GET_CUS_ID);
      while (rs.next()) {
        System.out.println(rs.getInt(1));
        return rs.getInt(1);
      }
    } catch (SQLException e) {

      e.printStackTrace();
    }

    return 0;
  }

  /**
   * @param customerid
   *          used to get last customer id.
   * @return
   */
  public static int checkCustomerId(int customerid) {
    try {
      prepare = con.prepareStatement(CHECK_CUS_ID);
      prepare.setInt(1, customerid);
      int avail = prepare.executeUpdate();
      if (avail > 0) {
        return 1;
      }
    } catch (SQLException e) {

      e.printStackTrace();
    }

    return -1;

  }
}
