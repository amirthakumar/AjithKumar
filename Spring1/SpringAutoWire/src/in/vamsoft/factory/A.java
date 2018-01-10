package in.vamsoft.factory;

public class A {

	private A() {
		
		System.out.println(" Inside Private Constructor ");
	}
	public static A getA()
	{
		System.out.println("Inside the Factory Method ");
		return new A();
	}
	public void display()
	{
		System.out.println("Hi Ajith");
	}
}
