package in.vamsoft.inheritbean;

public class Employee {

	private int id;
	private String name;
	private Address address;

	public Employee() {
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	

	public Employee(int id, String name, Address address,Address address2) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.address=address2;
	}

	void show() {
		System.out.println(id + " " + name);
		System.out.println(address);
	}

}
