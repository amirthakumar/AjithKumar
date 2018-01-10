package in.vamsoft.db;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.vamsoft.daofactory.StudentDaoUtilFactory;
import in.vamsoft.model.Student;
import in.vamsoft.testutil.StudentDaoUtil;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
    String name = request.getParameter("name");
    String password = request.getParameter("pwd");
    Student stud = new Student(name, password);
    StudentDaoUtil obj = StudentDaoUtilFactory.createInstance();
    obj.add(stud);

  }

}
