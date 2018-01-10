package in.vamsoft.employeeDaoImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.vamsoft.EmployeeDao.EmployeeDao;
import in.vamsoft.dbutil.DbConnection;
import in.vamsoft.model.Department;
import in.vamsoft.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

  Connection con = DbConnection.getConnection();

  /* (non-Javadoc)
   * @see in.vamsoft.employeeDaoImpl.EmployeeDao#getAlldepartments()
   */
  @Override
  public List<Department> getAlldepartments() {
    List<Department> list = new ArrayList<>();
    try (PreparedStatement statement = con.prepareStatement("select department_id,department_name from departments");) {
      ResultSet rs = statement.executeQuery();
      while (rs.next()) {
        Department dept = new Department(rs.getString(2), rs.getInt(1));
        list.add(dept);

      }

    } catch (SQLException e) {

      System.err.println("Please Check The Code And Connection " + e);

    }
    return list;
  }
  
  /* (non-Javadoc)
   * @see in.vamsoft.employeeDaoImpl.EmployeeDao#getAllemployees()
   */
  @Override
  public List<Employee> getAllemployees()
  {
    List<Employee> list=new ArrayList<>();
    try(PreparedStatement statement=con.prepareStatement("select * from empcopy");)
    {
      ResultSet rs=statement.executeQuery();
      while(rs.next())
      {
        Employee emp=new Employee(rs.getInt(1) , rs.getString(2), rs.getDouble(3), rs.getDate(4).toLocalDate(), rs.getInt(5));
        list.add(emp);
        
      }
      
    } catch (SQLException e) {
      
      System.err.println("Error occured in getAllEmployees "+ e);
      
    }
    return list;
  }
  public int addEmployee(Employee emp)
  {
    int n = 0;
    try {
      PreparedStatement statement=con.prepareStatement("insert into empcopy values (?,?,?,?,?)");
      statement.setInt(1, emp.getEmpId());
      statement.setString(2, emp.getName());
      statement.setDouble(3, emp.getSalary());
      statement.setDate(4, Date.valueOf(emp.getDoj()));
      statement.setInt(5 , emp.getDeptId());
      n=statement.executeUpdate();
      
      
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return n;
    
  }

  public int deleteEmployee(int empId) {

    int n=0;
    try {
      PreparedStatement statement=con.prepareStatement("delete from empcopy where empid=?");
      statement.setInt(1, empId);
      n=statement.executeUpdate();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    
    return n;
  }

  public int update(Employee e)
  {
    
    try {
      con.prepareStatement("update empcopy set fname=?,salary ");
    } catch (SQLException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
    
    
    return 0;
    
    
  }
  
}
