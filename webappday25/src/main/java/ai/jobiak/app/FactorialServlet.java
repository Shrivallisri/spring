package ai.jobiak.app;
import java.sql.*;
	

	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.Set;

	import javax.servlet.Servlet;
	import javax.servlet.ServletConfig;
	import javax.servlet.ServletException;
	import javax.servlet.ServletRequest;
	import javax.servlet.ServletResponse;

	public class FactorialServlet implements Servlet {

		@Override
		public void destroy() {
			// TODO Auto-generated method stub

		}

		@Override
		public ServletConfig getServletConfig() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getServletInfo() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void init(ServletConfig config) throws ServletException {
			// TODO Auto-generated method stub

		}

		@Override
		public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

			PrintWriter out = res.getWriter();
			
			int n=5;
			int fact =1;
			for(int i =1;i<=n;i++) {
				fact*=i;
			}
			out.println("The factorial of 5 is "+fact);
			out.println("<hr>");
			
			ArrayList<String>list = new ArrayList<>();
			list.add("Orange");
			list.add("blue");
			list.add("pink");
			for(String color:list) {
				out.println(color +"::"+color.length());
			}
			
			HashMap<String,String> techinventers = new HashMap();
			techinventers.put("Java", "james gosling");
			techinventers.put("C", "Dennis Ritchee");
			techinventers.put("Cpp","Stroustup");
			techinventers.put("Linux","Litnus Travold");
			techinventers.put("C#","Microsoft cop");


			
			
			out.println(techinventers);
			
			
			Set<String> keys = techinventers.keySet();
			for(String key:keys) {
				out.println(techinventers.get(key)+" Length of Value-> "+techinventers.get(key).length());
				
			}
		}

	}

