package in.vamsoft.daofactory;

import in.vamsoft.dao.UserDao;
import in.vamsoft.daoutil.UserDaoUtil;
import in.vamsoft.entities.User;

public class UserDaoFactory {

  public static UserDao getInstance()
  {
    
    UserDao obj=new UserDaoUtil();
    return obj;
  }
  
}
