package ai.jobiak.India;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadAttributesServlet
 */
@WebServlet("/read")
public class ReadAttributesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadAttributesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();//append("Servlet at").append(request.getContextPath());
		
ServletContext context=getServletContext();
		out.println("DBNAME"+context.getAttribute("dbName"));
		out.println("DBVERSION"+context.getAttribute("dbversion"));
		out.println("JDKVersion"+request.getAttribute("jdk"));
		out.println("Platform"+request.getAttribute("os"));

		
	}

}
