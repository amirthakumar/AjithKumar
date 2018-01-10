package in.vamsoft.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.parser.Scanner;

/**
 * Servlet implementation class BillInfoServlet
 */
@WebServlet("/BillInfoServlet")
public class BillInfoServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    String movie = request.getParameter("movie");
    String book = request.getParameter("book");
    String toy = request.getParameter("toy");

    Map<String, Integer> movieMap = (Map<String, Integer>) request.getAttribute("movie");
    Map<String, Integer> bookMap = (Map<String, Integer>) request.getAttribute("story");
    Map<String, Integer> toyMap = (Map<String, Integer>) request.getAttribute("toy");

    int movieRate = movieMap.get(movie);
    int bookRate = bookMap.get(book);
    int toyRate = toyMap.get(toy);

    request.setAttribute("movieRate", movieRate);
    request.setAttribute("bookRate", bookRate);
    request.setAttribute("toyRate", toyRate);
    request.setAttribute("address", "Chennai");
   
   
    
    /*out.println("<html><body>");
    out.println("<h4> Movie Name " + movie + " Price " + movieRate + "</h4>");
    out.println("<h4>Book Name " + book + " Price " + bookRate + "</h4>");
    out.println("<h4>Toy Name " + toy + " Price " + toyRate + "</h4>");
    out.println("<form action='FinalBillAmount' method='post'>");
    out.println("<input type='text' name='address'/>");
    out.println("Delivery Location <input type='submit' value='submit'/></form>");
    out.println("</body></html>");
*/
    RequestDispatcher rd = request.getRequestDispatcher("FinalBillAmount");
    rd.include(request, response);

  }

}
