package in.vamsoft.workout;

import java.util.ArrayList;

public class Employee {

	int id;
	String name;
	ArrayList<Employee> list;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee(int id, String name, ArrayList<Employee> list) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
