package in.vamsoft.entities;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class EmployeeDAOFactory {

  public static Logger logger = Logger.getLogger(EmployeeMain.class);
  public static EmployeeDAOjdbcImpl getEmployeeDAOObj()
  {
    EmployeeDAOjdbcImpl impl=null;
    try {
      impl = new EmployeeDAOjdbcImpl();
      
    } catch (ClassNotFoundException | SQLException | IOException e) {
      
      logger.info("The Object is Not Created ",e);
    }
    return impl;
  }
  
}
     