package in.vamsoft.corejava;

public class TestEmployee {
	
    public static void main(String[] args) {
		
		Employee ob=new Employee(100, "Ajith");
		System.out.println(ob.getEmployeeCode());
		System.out.println(ob.getEmployeeName());
		System.out.println(ob.getSalary());
		ob.raiseSalary(1000.0);
	
	}


}
