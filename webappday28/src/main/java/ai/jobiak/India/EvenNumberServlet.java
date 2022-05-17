package ai.jobiak.India;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EvenNumberServlet
 */
public class EvenNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	private static final int Integer = 0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EvenNumberServlet() {
        super();
        // TODO Auto-generated constructor stub
        
        MultiplicationServlet m = new MultiplicationServlet();
        
        System.out.println(m.a);
        System.out.println(m.c);
        System.out.println(m.d);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		int n=Integer.parseInt(request.getParameter("t1"));
		if(n%2==0)
			out.println(n+"is a even number");
		else
			out.println(n+"is a odd number");
	}
}

