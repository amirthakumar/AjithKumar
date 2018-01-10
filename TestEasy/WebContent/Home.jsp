<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
  function preventBack() {
    window.history.forward();
  }

  setTimeout("preventBack()", 0);

  window.onunload = function() {
    null
  };
</script>  

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>

	<h1>Welcome ${param.name}</h1>
	<%
	  session.setAttribute("name", request.getParameter("name"));
	%>
	<p>Click To Start The Test</p>
	<a href="TestFor.jsp"><button>Start Test</button></a>



</body>
</html>