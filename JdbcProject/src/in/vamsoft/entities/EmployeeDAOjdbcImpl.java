package in.vamsoft.entities;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.log4j.Logger;
import in.vamsoft.jdbc.JdbcDaoConnection;

public class EmployeeDAOjdbcImpl implements AutoCloseable, EmployeeDAO {

  Connection con;
  PreparedStatement statement;
  ResultSet rs;
  
  public static Logger logger = Logger.getLogger(EmployeeDAOjdbcImpl.class);
  public EmployeeDAOjdbcImpl() throws ClassNotFoundException, SQLException, IOException {

    con=JdbcDaoConnection.getConnection();
  }
  
 
  @Override
  public boolean addEmployee(Employee emp) throws SQLException
  {
    try(PreparedStatement statement=con.prepareStatement("insert into empdemo1 values(?,?,?,?,?)");)
    {
    statement.setInt(1, emp.getEmpId());
    statement.setString(2, emp.getEmpName());
    statement.setDouble(3, emp.getSalary());
    statement.setDate(4, Date.valueOf(emp.getDoj()));
    statement.setInt(5,emp.getDeptId());
    int rowsUpdated=statement.executeUpdate();
    return rowsUpdated > 0? true:false;
    }catch(SQLException e)
    {
      logger.error("The Values Not Updated",e);
    }
    return false;
  }
  @Override
  public boolean removeEmployee(int empId)
  {
    try(PreparedStatement statement=con.prepareStatement("delete from empdemo1 where empId=?");)
    {
      statement.setInt(1, empId);
      int rowsUpdated=statement.executeUpdate();
      return rowsUpdated>0 ?true:false;
      
    } catch (SQLException e) {
     
      logger.error("Not removed",e);
    }
    return false;
  }
  @Override
  public void close() throws SQLException  {
    // TODO Auto-generated method stub
    JdbcDaoConnection.closeConnection();
    
  }

  
  
}
