<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="user" class="in.vamsoft.service.EmptyUser"></jsp:useBean>
<jsp:setProperty property="name" name="user"/>
Name : <jsp:getProperty property="name" name="user"/>


</body>
</html>