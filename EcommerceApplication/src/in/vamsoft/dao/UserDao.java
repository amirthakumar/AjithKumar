package in.vamsoft.dao;

import in.vamsoft.entities.User;

public interface UserDao {

  int add(User user);
  int checkLogin(String name,String password);
}