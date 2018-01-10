package in.vamsoft.jdbc;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpStore {

  
  
  public static void main(String[] args) throws FileNotFoundException {
    
    FileOutputStream fos=new FileOutputStream("/home/vamsoft/Desktop/JdbcStore");
     
    Connection con=DbConnection.getConnection();
    try {
      Statement st=con.createStatement();
      ResultSet rs=st.executeQuery("select first_name from employees");
      while(rs.next())
      {
        String s=rs.getString(1);
        byte[] b=s.getBytes();
        fos.write(b);
        fos.write(System.getProperty("line.separator").getBytes());
        
      }
      
    
    
    } catch (SQLException | IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    
    
    
  }
}
