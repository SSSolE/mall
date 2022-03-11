<%@page import="dao.Repository"%>
<%@page import="dto.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%-- jsp 태그를 사용해서 빈 객체를 생성하면 무조건 빈 객체의 기본 생성자를 호출 --%>
<%-- <jsp:useBean id="productDAO" class="dao.Repository" scope="session" /> --%>

<%
	Repository productDAO = Repository.getInstance();
	List<Product> listOfProducts = productDAO.getAllProducts();
%>

<div class="low" align="center">
<%
for(int i=0; i<listOfProducts.size(); i++) {
	Product product = listOfProducts.get(i);
%>
	<div class="col-md-4">
		<img src="./images/<%=product.getFilename() %>">
		<h3><%= product.getPname() %></h3>
		<p><%= product.getDescription() %></p>
		<p><%= product.getUnitPrice() %>원</p>
		<p> <a href="frontController.jsp?active=product_info&?id=<%= product.getProductId() %>" class="btn btn-secondary" role="button">상세 정보 &raquo;</a> </p>
	</div>

<%
	}
%>
</div>