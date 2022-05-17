package ai.jobiak.India;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PalindromeServlet
 */
public class PalindromeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PalindromeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  PrintWriter pw;    
	        response.setContentType("text/html");    
	        pw=response.getWriter();    
	            
	            
	        String name=request.getParameter("name");    
	            
	        StringBuffer sb=new StringBuffer(name);    
	        String reverse=sb.reverse().toString();    
	            
	        if(name.equalsIgnoreCase(reverse))    
	        {    
	            pw.println("It is a palindrome");    
	        }    
	        else    
	        {    
	            pw.println("It is not a palindrome");    
	        }    
	            
	        pw.close();    
	            
	    }    
	    
	   
	    
	
	}


