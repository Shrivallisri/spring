package ai.jobiak.state;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ai.jobiak.India.MultiplicationServlet;

/**
 * Servlet implementation class CounterCookieServlet
 */
public class CounterCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HttpServletRequest request;
	private int beginig;
	private HttpServletResponse respone;
	private Object CookiecounterCookie;
	private Cookie counterCookie;
       
    /**
     * @see HttpServlet#HttpServlet()
     * 
     */
    public CounterCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
        new MultiplicationServlet();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();//  .append("Served at:").append(request.getContextPath());	
		
		int count = 0;
		Cookie[] cookies=request.getCookies();
		
		if( cookies!=null) {
		    System.out.println(cookies[0]);	
		    for(int i=0;i<cookies.length;i++) {
			
		    	
		    	if(cookies[i].getName().equals("visits")) {
		    		
		    		int cookieCounter=Integer.parseInt(cookies[i].getValue());
		    		System.out.println(cookieCounter);
		    		 count = cookieCounter;
		    	}
		    
		    }
		}
	    
		out.println("count="+(++count));
	    Cookie counterCookie=new Cookie("visits",count+"");
	    response.setContentType("text/html");
	    response.addCookie(counterCookie);
	    out.println("<h2>You have visited #times="+count+"</h2");
	    
	    }
	}

	