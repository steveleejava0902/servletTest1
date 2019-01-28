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
@WebServlet("/T3")
public class servletT3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletT3() {
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
	       
	   	int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));
		int c = (b - a + 1) * 9;
		String[] gugustrget = new String[c];
		gugustrget = printGuguAtoB(a,b);
	       
		
		out.println("<table style=\"border: 1px solid \">");
	
			for(int x = 0; x < c; x++){
				System.out.println(gugustrget[x]);
	
				out.println("<tr style=\"border: 1px solid \">");
				out.println("<td style=\"border: 1px solid \">");
				out.println(gugustrget[x]);
				out.println("</td>");
				out.println("</tr>");
		
			}
		


		out.println("</table>");
		
		
	    out.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	public String[] printGuguAtoB(int i, int j) {
		// TODO Auto-generated method stub
		int c = (j - i + 1) * 9;
		
		String[] gugustr = new String[c];
		int cnt = 0;
		for(; i <= j; i++) {
			for(int a=1; a <= 9; a++) {
				gugustr[cnt] = i + " * " + a + " = " + i * a;
				cnt++;
			}
		}
		System.out.println("cnt:" + cnt);
		System.out.println("c:" + c);
		return gugustr;
		
	}

}
