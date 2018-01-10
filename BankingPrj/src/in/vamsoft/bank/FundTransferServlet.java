package in.vamsoft.bank;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FundTransferServlet
 */
@WebServlet("/FundTransferServlet")
public class FundTransferServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  HttpSession session=request.getSession(false);
	  String name=(String)session.getAttribute("Name");
	  if(name==null)
	  {
	    response.sendRedirect("Login.html");
	  }
	  else
	  {
	  response.getWriter().println("<html><body>Hello"+name+"Your Transaction Completed Successfully <a href='LogoutServlet'>Log Out</body></html>");
	  }
	  
	  
	}

}
