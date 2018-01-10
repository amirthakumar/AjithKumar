package in.vamsoft.urlvalidator;

import org.apache.commons.validator.routines.UrlValidator;

public class Sample {

	
	public static void main(String[] args) {
		
		UrlValidator validator=new UrlValidator();
		boolean check=validator.isValid("www.google.com");
		System.out.println(check);
		
		
	}
	
	
}
