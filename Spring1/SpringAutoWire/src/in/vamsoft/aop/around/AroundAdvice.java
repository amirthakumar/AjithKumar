package in.vamsoft.aop.around;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		
		Object obj;
		System.out.println("Additional Information before actual Logic");
		obj = arg0.proceed();
		System.out.println("Additional Information after actual Logic");

		return obj;
		
	}

}
