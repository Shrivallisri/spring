<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Enter your Data</h2>
<form name ="signupform" action="beanAction.jsp"method="post">
    Enter first name:<input type="text" name="fname"><br/>
    Enter email:<input type="text" name="email"><br/>
    Enter mobile:<input type="text" name="mobile"><br/>
    Click to send data<input type="submit" value="send"><br/>
    <input type="reset" value="clean"><br/> 
    </form>
</body>
</html>