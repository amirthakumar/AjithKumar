package in.vamsoft.dao;


import org.springframework.jdbc.core.JdbcTemplate;

public interface EmployeeDao {

	void setTemplate(JdbcTemplate template);

}