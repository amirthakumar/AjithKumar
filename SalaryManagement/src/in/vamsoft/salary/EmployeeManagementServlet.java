package in.vamsoft.salary;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.vamsoft.exception.MyException;

/**
 * Servlet implementation class EmployeeManagementServlet .
 */
@WebServlet("/EmployeeManagementServlet")

public class EmployeeManagementServlet extends HttpServlet {

  

  

  private static final long serialVersionUID = 1L;

  protected void doPost(HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException {

    double salary = 0;
    String dateOfJoin;
    LocalDate startDate = null;
    LocalDate endDate;
    long monthsInYear;
    RequestDispatcher rd;
    dateOfJoin = request.getParameter("doj");
    try {
    
    startDate = LocalDate.parse(dateOfJoin, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
  
    
    }catch (DateTimeParseException e) {
       
      request.setAttribute("Error", new DateTimeParseException("Please Enter the Valid Date", dateOfJoin, 0));
      rd=request.getRequestDispatcher("ErrorServlet");
      rd.forward(request, response);
      
      
    }
    endDate = LocalDate.now();
    monthsInYear = ChronoUnit.MONTHS.between(startDate, endDate);

    if (monthsInYear >= 12 && monthsInYear <= 23) {

      salary = 30000.00;

    } else if (monthsInYear >= 24 && monthsInYear <= 36) {
      salary = 40000.00;
    } else if (monthsInYear > 36) {
      salary = 60000.00;
    }
    request.setAttribute("salary", salary);
    RequestDispatcher rd1 = request.getRequestDispatcher("PaySlipServlet");
    rd1.forward(request, response);

  }

}
