package in.vamsoft.aop.annotation;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {

	@Pointcut("execution(* Operation.*(..))")
	public void k() {}

	@Before("k()")
	public void myadvice(Joinpoint jp)
	{
		
		System.out.println("Additional Information");
		
	}
	
}
