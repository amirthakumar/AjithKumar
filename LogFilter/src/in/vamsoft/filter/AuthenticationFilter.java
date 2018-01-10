package in.vamsoft.filter;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter(dispatcherTypes = { DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.INCLUDE }, urlPatterns = {
    "/AuthenticationFilter" }, servletNames = { "Servlet1" })
public class AuthenticationFilter implements Filter {

  /**
   * Default constructor.
   */
  public AuthenticationFilter() {
    // TODO Auto-generated constructor stub
    super();
  }

  /**
   * @see Filter#destroy()
   */
  public void destroy() {
    // TODO Auto-generated method stub
  }

  /**
   * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
   */
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    // TODO Auto-generated method stub
    // place your code here

    // pass the request along the filter chain

    HttpServletRequest request2 = (HttpServletRequest) request;

    HttpSession session = request2.getSession(false);

    HttpServletResponse response2 = (HttpServletResponse) response;

    String name = (String) session.getAttribute("name");
    session.getAttribute("password");
    if (name != null) {
      chain.doFilter(request, response);
    } else {
      response2.sendRedirect("index.html");
    }
  }

  /**
   * @see Filter#init(FilterConfig)
   */
  public void init(FilterConfig fConfig) throws ServletException {
    // TODO Auto-generated method stub
  }

}
