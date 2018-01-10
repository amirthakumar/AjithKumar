package in.vamsoft.corejava;

public class StaticBlocks {
	{
		System.out.println("This is My block");
	}
	static{
		System.out.println("Static block 1");
	}
	
	public static void main(String[] args) {
	
		new StaticBlocks();
		System.out.println("Main method");
	}
	static{
		System.out.println("staic block 2");
	}
	
	

}
