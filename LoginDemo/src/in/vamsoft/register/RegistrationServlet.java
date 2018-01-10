package in.vamsoft.register;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

 

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    String name = request.getParameter("name");
    String dob = request.getParameter("dob");
    String address = request.getParameter("address");
    String phoneNumber = request.getParameter("phnum");
    String gender = request.getParameter("gender");
    String hobbies[] = request.getParameterValues("hobbies");
    String hobbiesList ="" ;
    
    for (String s : hobbies) {

      
      hobbiesList += s + ",";

    }
    
    request.setAttribute("name", name);
    request.setAttribute("dob", dob);
    request.setAttribute("address", address);
    request.setAttribute("phoneNumber", phoneNumber);
    request.setAttribute("gender",gender);
    request.setAttribute("hobbiesList", hobbiesList);
    RequestDispatcher rd=request.getRequestDispatcher("RegistrationDaoImpl");
    rd.forward(request, response);
    
   
    

  }

}
