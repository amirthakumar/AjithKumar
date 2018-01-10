package in.vamsoft.bank;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ValidateServlet .
 */
@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    HttpSession session = request.getSession();
    String name = request.getParameter("uname");
    String password = request.getParameter("pwd");
    if (name.equals("Ajith") && password.equals("password")) {
      session.setAttribute("Name", name);
      session.setAttribute("Password", password);
      RequestDispatcher rd = request.getRequestDispatcher("HomeServlet");
      rd.forward(request, response);

    } else {
      response.sendRedirect("Login.html");

    }

  }

}
