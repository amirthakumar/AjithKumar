package in.vamsoft.retaildaoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDaoImpl {
  public static final String GET_PROD_ID = "select max(productid) from productaji";

  public static int getLastProductId() {
    Connection con = DbConnection.getConnection();
    Statement st;
    try {
      st = con.createStatement();

      ResultSet rs = st.executeQuery(GET_PROD_ID);
      while (rs.next()) {
        System.out.println(rs.getInt(1));
        return rs.getInt(1);
      }
    } catch (SQLException e) {

      e.printStackTrace();
    }
    
    
    
    return 0;
  }

  
}
