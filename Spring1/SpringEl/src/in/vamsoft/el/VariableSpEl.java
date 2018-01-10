package in.vamsoft.el;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class VariableSpEl {

	public static void main(String[] args) {
		
		
		Calculation calc=new Calculation();
		StandardEvaluationContext context=new StandardEvaluationContext(calc);
		ExpressionParser parser=new SpelExpressionParser();
		Expression exp=parser.parseExpression("number");
		exp.setValue(context, "5");
		System.out.println(calc.cube());
		
	}
	
	
}
