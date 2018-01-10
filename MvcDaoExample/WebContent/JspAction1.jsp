<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Display Page</title>
</head>
<body>

<jsp:useBean id="emp" class="in.vamsoft.model.Employee" scope="request"/>
<jsp:setProperty property="name" name="emp" param="empname"/>
<jsp:setProperty property="salary" name="emp" param="salary"/>
<jsp:forward page="JspAction2.jsp">

<jsp:param value="Ajith" name="name"/>

</jsp:forward>




</body>
</html>