package ai.jobiak.India;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FibonacciServlet
 */
public class FibonacciServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String t2;
	private int i;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FibonacciServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();//.append("Served at: ").append(request.getContextPath());
		 String s=request.getParameter("n1");
        int n=Integer.parseInt(s);
        int i=1,f1=0,f2=1,f3;
        while(i<=n)
        {
          out.println(f1);
          f3=f1+f2;
          f1=f2;
          f2=f3;
          i=i+1; 
	}
        out.println("The fibanocci is:"+f1);
}
}