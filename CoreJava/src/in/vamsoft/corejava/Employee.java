package in.vamsoft.corejava;

public class Employee {

  private int employeeCode;
  private String employeeName;
  private double salary;

  public Employee(int employeeCode, String employeeName) {
    this(employeeCode, employeeName, 25000.0);
  }

  /** Employee
   * Initialize
   * 
   * @param employeeCode
   *          id of the employee
   * @param employeeName
   *          name
   * @param salary
   *          It is Used to Initialize the value of the Employee
   */
  public Employee(int employeeCode, String employeeName, double salary) {
    super();
    this.employeeCode = employeeCode;
    this.employeeName = employeeName;
    this.salary = salary;
  }

  public int getEmployeeCode() {
    return employeeCode;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public double getSalary() {
    return salary;
  }

  public void raiseSalary(double sal) {
    if (sal < this.salary * 0.10) {
      System.out.println("The Amount is invalid");
    } else {
      System.out.println(this.salary = sal + this.salary);
    }

  }
}
