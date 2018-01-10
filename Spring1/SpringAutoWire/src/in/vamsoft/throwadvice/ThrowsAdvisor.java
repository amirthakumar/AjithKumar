package in.vamsoft.throwadvice;

import org.springframework.aop.ThrowsAdvice;

public class ThrowsAdvisor implements ThrowsAdvice {

	public void afterThrowing(Exception e)
	{
		
		System.out.println("Additional Concern if Exception Occurs");
		
	}
	
}
