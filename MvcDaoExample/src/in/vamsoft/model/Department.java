package in.vamsoft.model;

public class Department {

  private String depName;
  private int depId;
  public Department(String depName,int depId) {
    super();
    this.depName = depName;
    this.depId = depId;
  }
  public String getDepName() {
    return depName;
  }
  public void setDepName(String depName) {
    this.depName = depName;
  }
  public int getDepId() {
    return depId;
  }
  public void setDepId(int depId) {
    this.depId = depId;
  }
  @Override
  public String toString() {
    return "Department [depName=" + depName + ", depId=" + depId + "]";
  }
  
  
}
