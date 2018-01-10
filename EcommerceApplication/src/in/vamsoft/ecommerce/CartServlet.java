package in.vamsoft.ecommerce;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    Map<String, Integer> movieMap = new TreeMap<>();
    movieMap.put("Unnai Ninaithu", 100);
    movieMap.put("Poove Unakaga", 200);
    movieMap.put("Aashiq 2", 300);

    Map<String, Integer> storyMap = new TreeMap<>();

    storyMap.put("Kindle", 400);
    storyMap.put("Story", 300);
    storyMap.put("Navel", 100);

    Map<String, Integer> toyMap = new TreeMap<>();

    toyMap.put("Dora", 200);
    toyMap.put("Power Ranger", 300);
    toyMap.put("SuperMan", 500);

    request.setAttribute("movie", movieMap);
    request.setAttribute("story", storyMap);
    request.setAttribute("toy", toyMap);

    RequestDispatcher rd = request.getRequestDispatcher("BillInfoServlet");
    rd.forward(request, response);

  }

}
