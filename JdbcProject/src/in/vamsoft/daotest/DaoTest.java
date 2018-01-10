package in.vamsoft.daotest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import in.vamsoft.entities.EmployeeDAO;
import in.vamsoft.entities.EmployeeDAOjdbcImpl;

public class DaoTest {
  static EmployeeDAO dao;

  @BeforeClass
  static void setUpBeforeClass()throws Exception
  {
    dao=new EmployeeDAOjdbcImpl();
  }
  @Test
  public void test() {
    fail("Not yet implemented");
  }
  

}
