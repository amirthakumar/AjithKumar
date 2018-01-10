package in.vamsoft.ecommerce;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.vamsoft.dao.UserDao;
import in.vamsoft.daofactory.UserDaoFactory;

/**
 * Servlet implementation class ValidateServlet .
 */
@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    
    String name = request.getParameter("uname");
    String password = request.getParameter("pwd");
    UserDao obj=UserDaoFactory.getInstance();
    int check=obj.checkLogin(name, password);
    if(check==1)
    {
      HttpSession session = request.getSession();
      session.setAttribute("Name", name);
      session.setAttribute("Password", password);
      response.sendRedirect("Catalogue.html");

    }
    else {
    
    response.sendRedirect("Login.html");

  }

  }}
