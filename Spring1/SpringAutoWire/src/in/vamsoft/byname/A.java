package in.vamsoft.byname;

public class A {

	B1 b;

	A() {
		System.out.println("a is created");
	}

	public B1 getB() {
		return b;
	}

	public void setB(B1 b) {
		this.b = b;
	}

	void print() {
		System.out.println("hello a");
	}

	void display() {
		print();
		b.print();
	}

}
