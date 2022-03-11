<%@page import="dao.Repository"%>
<%@page import="dto.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page errorPage="../../error/NoProductError.jsp" %>
<%-- <jsp:useBean id="productDAO" class="dao.Repository" scope="session" /> --%>

<%
	Repository productDAO = Repository.getInstance();
	String id = request.getParameter("id");
	Product product = productDAO.getProductById(id);
%>

<div class="low">
	<div class="col-md-6">
		<div class="col">
			<img src="images/<%=product.getFilename() %>">
		</div>
		<h3><%=product.getPname() %></h3>
		<p><%=product.getDescription() %></p>
		<p> <b>상품 코드 : </b> <span class="badge badge-danger"><%= product.getProductId() %></span> </p>
		<p> b<b>제조사</b> : <%= product.getManufacturer() %> </p>
		<p> b<b>분류</b> : <%= product.getCategory() %> </p>
		<p> b<b>재고 수</b> : <%= product.getUnitsInStock() %> </p>
		<h4> <%= product.getUnitPrice() %>원 </h4>
		<p>
			<a href="#" class="btn btn-info">상품 주문 &raquo;</a>
			<a href="frontController.jsp?active=product_list" class="btn btn-secondary">상품 목록 &raquo;</a>
		</p>
	</div>
</div>