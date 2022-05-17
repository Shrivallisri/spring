package ai.jobiak.India;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeNumberServlet
 */
public class PrimeNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimeNumberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    PrintWriter out=response.getWriter();
		
		int number = Integer.parseInt(request.getParameter("num"));
		
		out.println("  prime "+number);
		
		for(int i=2;i<number;i++) {
			boolean isprime=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					isprime = false;
					break;
				}
			}
			if(isprime==true)
				out.println(i);
		}
	}


	}

