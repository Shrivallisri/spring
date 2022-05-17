
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp@Jobiak</title>
</head>
<body>

<%! 

public int cube(int n){

	return n*n;
}

%>
<h3>
<% 
ArrayList<String>topics = new ArrayList<>();
topics.add("html, jsp, java");
topics.add("spring boot, c, hibernet");
topics.add("git,jenkins,aws");

for(String topic : topics){
out.println(topic+"<br>");
}
%>
</h3>

 <h3>5*5 is <%=cube(5) %></h3>
<h1>
<h3>

</h3>
<%=new String("welcome jobiak java gaints") %>
</h1>
<h2>
<% out.println("you can write java tags-which as scriptlets/expressions/declerations");%>
</h2>
</body>
</html>
<h3>
<% 
ArrayList<String>topics2 = new ArrayList<>();
topics2.add("html, jsp, java");
topics2.add("spring boot, c, hibernet");
topics2.add("git,jenkins,aws");

for(String topic : topics2){
out.println(topic+"<br>");
}
%>
</h3>

 <h3>5*5 is <%=cube(5) %></h3>
<h1>
<h3>

</h3>
<%=new String("welcome jobiak java gaints") %>
</h1>
<h2>
<% out.println("you can write java tags-which as scriptlets/expressions/declerations");%>
</h2>
</body>
</html>
  