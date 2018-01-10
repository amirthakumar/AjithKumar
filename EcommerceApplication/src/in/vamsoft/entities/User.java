package in.vamsoft.entities;

public class User {

  private String name;
  private String password;
  public User(String name, String password) {
    // TODO Auto-generated constructor stub
    this.name=name;
    this.password=password;
  
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  
  
}
