package in.vamsoft.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String name = request.getParameter("name");
    String password = request.getParameter("pwd");
    if (name.equals("Ajith") && password.equals("password")) {
      response.sendRedirect("Home.jsp");
    } else {
      PrintWriter out = response.getWriter();
      out.print("Your User Name And Password Is Wrong Please Check ");
      RequestDispatcher rd = request.getRequestDispatcher("Error.jsp");
      rd.include(request, response);
    }

  }

}
