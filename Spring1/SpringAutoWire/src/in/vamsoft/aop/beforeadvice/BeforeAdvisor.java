package in.vamsoft.aop.beforeadvice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvisor implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("Method Name : "+arg0.getName());
		System.out.println("Method Info : "+arg0.getModifiers());
		
		System.out.println("Inside before method ");

	}

}
