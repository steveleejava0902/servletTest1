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
@WebServlet("/T1")
public class servletT1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletT1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	       response.setContentType("text/html");
	       request.setCharacterEncoding("utf8");
	       response.setCharacterEncoding("utf8");
	       PrintWriter out = response.getWriter();
	       out.println("<html><head></head><body>");
	       out.println("<h1>servlet22, testPage</h1><p>this is sample servlet.</p>");
	       
	       int result = 0;
	       String resultString;
	       
	       for(int i = 2; i < 10; i++) {
	    	   for(int j = 1; j < 10; j++) {
	    		   result = i * j;
	    		   resultString = i + " * " + j + " = " + result;
	    		   out.println("<h1>" + resultString + "</h1>");
	    		   
	    	   }
	    		    
	    		   
	       }
	       
	       
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
