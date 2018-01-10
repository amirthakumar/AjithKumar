package in.vamsoft.daoimplfactory;

import in.vamsoft.employeeDaoImpl.EmployeeDaoImpl;

public class EmployeeDaoImplFactory {
  
  public static EmployeeDaoImpl getInstance()
  {
    return new EmployeeDaoImpl();
  }

}
