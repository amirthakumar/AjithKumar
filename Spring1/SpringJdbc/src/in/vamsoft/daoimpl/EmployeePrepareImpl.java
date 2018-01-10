package in.vamsoft.daoimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import in.vamsoft.dao.EmployeePrepareDao;
import in.vamsoft.model.Employee;

public class EmployeePrepareImpl implements EmployeePrepareDao {

	public JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	/* (non-Javadoc)
	 * @see in.vamsoft.daoimpl.EmployeePrepareDao#saveEmployee(in.vamsoft.model.Employee)
	 */
	@Override
	public Boolean saveEmployee(final Employee emp) {

		String query = "insert into employee values(?,?,?)";

		return template.execute(query, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub

				ps.setInt(1, emp.getId());
				ps.setString(2, emp.getName());
				ps.setFloat(3, emp.getSalary());

				return ps.execute();
			}
		});

	
	}

}
