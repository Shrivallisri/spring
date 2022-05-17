package ai.jobiak.assement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUpServlet extends HttpServlet{
	public SignUpServlet() {
		super();
	}
	
	 // HttpServlet doPost(HttpServletRequest request, HttpServletResponse response) method
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          
        // Get the values from the request using 'getParameter'
        String username = request.getParameter("name");
        String password = request.getParameter("phone");
        String email = request.getParameter("gender");
          
        // To get all the values selected for 
        // programming language, use 'getParameterValues'
        String progLang[] = request.getParameterValues("language");
        
        // Iterate through the String array to 
        // store the selected values in form of String
        String langSelect = "";
        if(progLang!=null){
            for(int i=0;i<progLang.length;i++){
                langSelect= langSelect + progLang[i]+ ", ";
            }
        }
          
        String courseDur = request.getParameter("duration");
        String comment = request.getParameter("comment");
                  
        // set the content type of response to 'text/html'
        response.setContentType("text/html");
          
        // Get the PrintWriter object to write 
        // the response to the text-output stream
        PrintWriter out = response.getWriter();
          
        // Print the data
        out.print("<html><body>");
        out.print("<h3>Details Entered</h3><br/>");
          
        out.print("Full Name: "+ name + "<br/>");
        out.print("Phone Number: "+ phNum +"<br/>");
        out.print("Gender: "+ gender +"<br/>");
        out.print("Programming languages selected: "+ langSelect +"<br/>");
        out.print("Duration of course: "+ courseDur+"<br/>");
        out.print("Comments: "+ comment);
          
        out.print("</body></html>");
          
    }
  
}


}
