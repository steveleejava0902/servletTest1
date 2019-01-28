package servletTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletT1
 */
@WebServlet("/T2")
public class servletT2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletT2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("guguinput: ").append(request.getContextPath());
		
		
	       response.setContentType("text/html");
	       request.setCharacterEncoding("utf8");
	       response.setCharacterEncoding("utf8");
	       PrintWriter out = response.getWriter();
	       out.println("<html><head></head><body>");
	       
	       out.println("<form action=\"T3\" autocomplete=\"off\">");
	       out.println("gugustart:<input type=\"text\" name=\"a\" />");
	       out.println("guguend:<input type=\"text\" name=\"b\" />");
	       out.println("<input type=\"submit\">");
	       out.println("</form>");	       
	       
	       out.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
