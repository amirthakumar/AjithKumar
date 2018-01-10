package in.vamsoft.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.vamsoft.dbutil.DbConnection;
import in.vamsoft.model.Employee;

public class EmployeeDetailsService {

  Connection con=DbConnection.getConnection();
  public List<Employee> getEmployee(int id)
  {
    List<Employee> list=new ArrayList<>();
    try(PreparedStatement statement=con.prepareStatement("select empid,fname,salary,doj from empcopy where deptid=?");)
    {statement.setInt(1, id);
        ResultSet rs=statement.executeQuery();
        while(rs.next())
        {
          Employee emp=new Employee();
          emp.setEmpId(rs.getInt(1));
          emp.setName(rs.getString(2));
          emp.setSalary(rs.getDouble(3));
          emp.setDoj(rs.getDate(4).toLocalDate());
          list.add(emp);
        }
    }catch (SQLException e) {
      
      System.err.println(e);
    }
    return list;
    
  
  
  } 
}
