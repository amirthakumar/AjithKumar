package in.vamsoft.jdbc;


import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class FirstJdbc1 {

  public static Logger logger = Logger.getLogger(FirstJdbc1.class);

  public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
      
    
    Connection con=JdbcDaoConnection.getConnection();
    System.out.println("done");
    System.out.println(JdbcDaoConnection.closeConnection());
    
    
  }
}
