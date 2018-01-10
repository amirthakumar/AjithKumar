package in.vamsoft.entities;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import org.apache.log4j.Logger;

public class EmployeeMain {

  public static Logger logger = Logger.getLogger(EmployeeMain.class);
  public static void main(String[] args) throws SQLException {
    
    Scanner scan=new Scanner(System.in);
    logger.info("Please Enter the EmpId : ");
    int empId=scan.nextInt();
    logger.info("Please Enter the Employee Name : ");
    String name=scan.next();
    logger.info("Please Enter the salary : ");
    double salary=scan.nextDouble();
    logger.info("Please Enter the Date Of Joining : ");
    LocalDate doj=LocalDate.parse(scan.next(),DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    logger.info("Please Enter the DeptId : ");
    int deptId=scan.nextInt();
    Employee emp=new Employee(empId, name, salary, doj, deptId);
    scan.close();
    
    EmployeeDAO dao=EmployeeDAOFactory.getEmployeeDAOObj();
    dao.addEmployee(emp);
    
    
  }
}
