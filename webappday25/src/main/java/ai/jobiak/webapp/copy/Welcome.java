package ai.jobiak.webapp.copy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Welcome implements Servlet {// like a mini server,

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		return null;
    }
   @Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "This is my first Servlet program-000";
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
    }
	
    @Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=arg1.getWriter();
		out.println(getServletInfo());
		

	}

}
