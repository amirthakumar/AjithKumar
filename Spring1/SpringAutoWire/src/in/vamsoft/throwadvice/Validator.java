package in.vamsoft.throwadvice;

public class Validator {

	public void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not a Valid Age");
			
		}
		else
		{
			System.out.println("Vote Confirmed");
			
		}
		
		
	}
	
	
}
