<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type = "text/javascript" >

   function preventBack(){window.history.forward();}

    setTimeout("preventBack()", 0);

    window.onunload=function(){null};

</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Log Out SuccessFully</title>
</head>
<body>

<h2> You Are Successfully Logged Out ...</h2>

<h3>Thank You ...! </h3>

<%session.invalidate();

%>

</body>
</html>