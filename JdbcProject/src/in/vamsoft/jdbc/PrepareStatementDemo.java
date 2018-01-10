package in.vamsoft.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.Scanner;

public class PrepareStatementDemo {

  public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
    //Scanner s=new Scanner(System.in);
    ResultSetMetaData metaData;
    Connection con=JdbcDaoConnection.getConnection();
    
    Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
    ResultSet rs=stmt.executeQuery("select * from empdemo1");
    metaData=rs.getMetaData();
    System.out.println("Total Column in The ResultSet "+metaData.getColumnCount());
    for(int i=1;i<=metaData.getColumnCount();i++)
    System.out.println(metaData.getColumnName(i));
    PreparedStatement statement=con.prepareStatement("update empdemo1 set salary=salary+? where empid=?");
    statement.setInt(1, 25000);
    statement.setInt(2, 101);
    int rowsupdated=statement.executeUpdate();
    System.out.println("Total Updated Rows : "+ rowsupdated);
    rs.first();
    rs.absolute(2);
    rs.updateInt(1, 70);
    rs.updateRow();
    JdbcDaoConnection.closeConnection();
    
  }
}
