package ai.jobiak.http;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MathTable
 */
@WebServlet("/mathtable")
public class MathTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MathTable() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int tab=Integer.parseInt(request.getParameter("tab"));
		int from=Integer.parseInt(request.getParameter("from"));
		int to=Integer.parseInt(request.getParameter("to"));
		for(int i=from;i<=to;i++) {
			response.getWriter().println(tab+"X"+i+"="+tab*i);
		}
		
	}

}
	
		