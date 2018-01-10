package in.vamsoft.cookies;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetCokkies
 */
@WebServlet("/GetCokkies")
public class GetCokkies extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub

    String name =null ;
    String password =null ;
    Cookie[] cookieList = request.getCookies();
    for (Cookie c : cookieList) {

      if (c.getName().equals("Name")) {
        name = c.getValue();

      }
      if (c.getName().equals("Password")) {
        password = c.getValue();

      }
    }
    response.getWriter().println("Hello !! "+name +"Your Password Is "+ password);
    
    

  }

}
