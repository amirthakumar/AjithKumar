package in.vamsoft.daoimpl;

import org.springframework.orm.hibernate5.HibernateTemplate;

import in.vamsoft.pojo.Employee;

public class EmployeeImpl {

	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	public void saveEmployee(Employee e)
	{
		template.save(e);
	}
	
}
