package ai.jobiak.India;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ArmstrongServlet
 */
public class ArmstrongServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArmstrongServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();//.append("Served at: ").append(request.getContextPath());
        
		int number = Integer.parseInt(request.getParameter("num"));
		
		
		int num,temp,total=0;
		num=number;
		while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num) { 
        	System.out.println("Amstrong nunber");
        	out.println(" Armstrong number");
        }
        else {
        	out.println("not  Armstrong number");
        }
	}

	}


