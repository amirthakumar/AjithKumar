<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

    List<String> names=new ArrayList<String>();
    names.add("Ajith");
    names.add("Kumar");
    pageContext.setAttribute("names", names);

%>

<strong>Employee From Request : </strong>${requestScope.employee}
<br>
<br>
<strong> Employee without Scope : </strong>${Employee}
<br>
<br>
<strong>Using [] :</strong>${applicationScope["User.cookie"]}
<br>
<br>
<strong>Printing Employee's City : </strong>
${sessionScope.employee1.address.city}
<strong>Printing First Element of List : </strong> ${names[1] }
<br>
<br>
<strong> Header Information :</strong>
${header["Accept-Encoding"]}
<br>
<br>
<strong>Accessing Cookie : </strong>${cookie["User.cookie"].value}
<br>
<br>
<strong>Getting the Request metho from PageContext : </strong>
Http Method is ${pageContext.request.method}
<br>
<br>
<%-- <%getServletContext().setAttribute("DummyParam", "Hi"); %> --%>
<strong>Getting Context param : </strong> ${initParam.DummyParam}
<br>
<br>
<strong>Getting Request Param</strong>
${param.name }
<br>
<br>
</body>
</html>