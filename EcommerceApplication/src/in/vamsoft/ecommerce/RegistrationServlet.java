package in.vamsoft.ecommerce;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.vamsoft.dao.UserDao;
import in.vamsoft.daofactory.UserDaoFactory;
import in.vamsoft.daoutil.UserDaoUtil;
import in.vamsoft.entities.User;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String name=request.getParameter("newname");
  String password=request.getParameter("newpassword");
  UserDao userDao=UserDaoFactory.getInstance();
  User user=new User(name, password);
  userDao.add(user);
  
  

	
	}

}
