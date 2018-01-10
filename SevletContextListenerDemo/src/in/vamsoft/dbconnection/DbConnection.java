package in.vamsoft.dbconnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {

  
  public static Connection getConnection() {
    
    File file=new File("/home/vamsoft/Desktop/db.properties");
    Properties prop=new Properties();
    try {
      prop.load(new FileInputStream(file));
      String driver=prop.getProperty("driver");
      String url=prop.getProperty("url");
      String userName=prop.getProperty("username");
      String password=prop.getProperty("password");
      
      try {
        Class.forName(driver);
        Connection con=DriverManager.getConnection(url,userName,password);
        return con;
        
        
        
        
      } catch (ClassNotFoundException | SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      System.out.println(prop.keySet());
      
      
      
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return null;
    
    
  }
  
}
