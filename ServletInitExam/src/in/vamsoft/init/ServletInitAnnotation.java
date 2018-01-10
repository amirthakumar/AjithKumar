package in.vamsoft.init;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletInitAnnotation
 */



@WebServlet(urlPatterns="/ServletInitAnnotation",initParams= {@WebInitParam(name = "MyName", value = "Ajith")})
public class ServletInitAnnotation extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	ServletConfig config;
	String name;
//	@Override
//  public void init(ServletConfig config) throws ServletException {
//   
//	  
//	  name=config.getInitParameter("MyName");
//	  
//	  
//  }



  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    
	  
	  PrintWriter out=response.getWriter();
	  //out.println(name);
	  ServletConfig config1=getServletConfig();
	  out.println(config1.getInitParameter("MyName"));
	  
	  request.authenticate(response);
	  //request.login(arg0, arg1);
	  
	  
	  
	  
	  
	}

}
