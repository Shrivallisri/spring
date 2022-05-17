<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>CART</h1>
<%
public class Product {
	
	private String productId;
	private String description;
	private double price;
	
public Product() {
}
public Product(String productId,String description,double price) {
	super();
	this.productId = productId;
	this.description = description;
	this.price = price;
}
}

%>
<form action="shoppingCart.jsp" method="post">

<input type="text" name="productId"placeholder="ProductId"><br/>
<input type="text" name="description"placeholder="Description"><br/>
<input type="text" name="price"placeholder="price"><br/>
<input type="submit" value="Add Iteam to Cart"><br/>
</form>

<%
ArrayList<Product> productList= new ArrayList<>();
ArrayList<Product> itemsList = null;
itemsList = getProductIds();//private method for db connection and fetch
out.println("<hr>");
		%>
		<% 
		 for(int i=0;i<itemsList.size();i++) {

	    	out.println("<a href='cart4?item="+itemsList.get(i).getProductId()+"'>Add Item "+itemsList.get(i).getProductId()+"</a><br/>");
	    }
		%>
	<%
	   ArrayList<Product>selectedItemsList = null;
    
    if(shoppingCart.isNew()) {//this code executes when the first request is made for this servlet
    	selectedItemsList = new ArrayList<>();
    	shoppingCart.setAttribute("items",selectedItemsList);
    }
</body>
</html>