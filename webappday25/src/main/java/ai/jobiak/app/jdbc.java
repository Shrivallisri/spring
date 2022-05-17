package ai.jobiak.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class jdbc implements Servlet {

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
		// TODO Auto-generated method stub
		PrintWriter out = res.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}
		 
	  String userName="root";
   	  String password="admin";
   	  String url="jdbc:mysql://localhost:3306/world";
   	  try {
   		  Connection con=DriverManager.getConnection(url,userName,password);
   		  
   		  Statement st=con.createStatement();
   		  String sql="select * from city";
   		  ResultSet rs =st.executeQuery(sql);
   		  while (rs.next()) {
   			  out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3)+"::"+rs.getString(4)+"::"+rs.getString(5));
   		  }
   	  }catch(SQLException e) {
   		  
   		  e.printStackTrace();
   		  
   	  }
   		  out.println("Connected to database successfully....");
	}
 

	}

