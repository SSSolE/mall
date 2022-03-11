<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%--
사용자가 웹 사이트 내 frontController.jsp 로 접근하도록 유도하는 방법

1. 리다이렉트를 시킨다. (Servlet, JSP, JS 등을 활용)
 
<script>
	location.href = "http://mall.com/frontController.jsp?active=main";
</script>

2. 서버 설정을 통해서 사용자가 느끼지 못하게 frontController.jsp 로 접근하도록 한다.
   /WEB-INF/web.xml 에 welcome file을 등록
   또는 .do 같은 특정 URL 패턴을 만들어서 Servlet Mapping을 사용해 처리를 한다.
--%>