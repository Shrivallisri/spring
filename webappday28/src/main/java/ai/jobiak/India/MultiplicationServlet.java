package ai.jobiak.India;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MultiplicationServlet
 */
public class MultiplicationServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public String a = "public";
	private String b = "provate";
	protected String c = "protected";
	default String d = "default";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MultiplicationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charse=UTF-8");
		out.println("<html><head><title>CalculatorServlet</title></head><body>");
		double a =Double.parseDouble(request.getParameter("num1"));
		double b =Double.parseDouble(request.getParameter("num2"));
		
		out.println(a*b);
		
	}

}
