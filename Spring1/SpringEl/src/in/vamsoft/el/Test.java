package in.vamsoft.el;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {

		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("'Welcome SPEL'.concat('!')");
		Expression exp1 = parser.parseExpression("new String('hello world').toUpperCase()");  
		String msg = (String) exp.getValue();
		String msg1=(String) exp1.getValue(String.class);
		System.out.println(msg);
		System.out.println((msg1));

	}

}
