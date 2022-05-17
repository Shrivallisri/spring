package ai.jobiak.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charse=UTF-8");
		out.println("<html><head><title>CalculatorServlet</title></head><body>");
		double a =Double.parseDouble(request.getParameter("num1"));
		double b =Double.parseDouble(request.getParameter("num2"));
		double result =0;
		
		String opr = request.getParameter("opr");
		if(opr.equals("+")) {
			result = a+b;
			out.println("<h1>Result = "+result);
		}
		else if(opr.equals("*")) {
			result= a*b;
			out.println("<h1>Result = "+result);
     	}
		else if(opr.equals("-")) {
			result= a-b;
			out.println("<h1>Result = "+result);
		}
		else if(opr.equals("/")) {
			result= a/b;
			out.println("<h1>Result = "+result);
		}
		else if(opr.equals("%")) {
			result= a%b;
			out.println("<h1>Result = "+result);
		}
		else 
			out.print(false);
		out.println("</body></html>");
		
		
	}

}
	
		