package in.vamsoft.EmployeeDao;

import java.util.List;

import in.vamsoft.model.Department;
import in.vamsoft.model.Employee;

public interface EmployeeDao {

  List<Department> getAlldepartments();

  List<Employee> getAllemployees();

}