package in.vamsoft.daoimpl;

import org.springframework.jdbc.core.JdbcTemplate;

import in.vamsoft.dao.EmployeeDao;
import in.vamsoft.model.Employee;

public class EmployeeImpl implements EmployeeDao {

	private JdbcTemplate template;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * in.vamsoft.daoimpl.EmployeeDao#setTemplate(org.springframework.jdbc.core.
	 * JdbcTemplate)
	 */
	@Override
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int saveEmployee(Employee emp) {
		String saveQuery = "insert into employee values('" + emp.getId() + "','" + emp.getName() + "','" + emp.getSalary()
				+ "')";

		return template.update(saveQuery);
	}

	public int showEmployee() {
		String showSql = "Select * from employee";
		return template.update(showSql);
	}

}
