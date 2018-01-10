<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="in.vamsoft.testutil.ReadExcel"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script type = "text/javascript" >

   function preventBack(){window.history.forward();}

    setTimeout("preventBack()", 0);

    window.onunload=function(){null};

</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test</title>
</head>
<body>

<p align="right" id="demo"><b> Timing Starts </b></p>
	<h2>Hello ${sessionScope.name} Your Test Started</h2>

	<h3>All The Best</h3>
	<h4>Apptitude : Numbers</h4>
	

	<form action="Result.jsp">
	
	
		<p>
			1.<%=ReadExcel.readQuestion(1, 1)%></p>

		<input type="radio" value="A" name="Ans1" />A.
		<%=ReadExcel.readQuestion(1, 2)%>
		<br> <input type="radio" value="B" name="Ans1" />B.
		<%=ReadExcel.readQuestion(1, 3)%>
		<br> <input type="radio" value="C" name="Ans1" />C.
		<%=ReadExcel.readQuestion(1, 4)%>
		<br> <input type="radio" value="C" name="Ans1" />C.
		<%=ReadExcel.readQuestion(1, 5)%>
		<br>



		<p>
			2.<%=ReadExcel.readQuestion(2, 1)%></p>

		<input type="radio" value="A" name="Ans2" />A.
		<%=ReadExcel.readQuestion(2, 2)%>
		<br> <input type="radio" value="B" name="Ans2" />B.
		<%=ReadExcel.readQuestion(2, 3)%>
		<br> <input type="radio" value="C" name="Ans2" />C.
		<%=ReadExcel.readQuestion(2, 4)%>
		<br> <input type="radio" value="C" name="Ans2" />C.
		<%=ReadExcel.readQuestion(2, 5)%>
		<br>



		<p>
			3.<%=ReadExcel.readQuestion(3, 1)%></p>

		<input type="radio" value="A" name="Ans3" />A.
		<%=ReadExcel.readQuestion(3, 2)%>
		<br> <input type="radio"
		 value="B" name="Ans3" />B.
		<%=ReadExcel.readQuestion(3, 3)%>
		<br> <input type="radio" value="C" name="Ans3" />C.
		<%=ReadExcel.readQuestion(3, 4)%>
		<br> <input type="radio" value="C" name="Ans3" />C.
		<%=ReadExcel.readQuestion(3, 5)%>
		<br>



		<p>
			4.<%=ReadExcel.readQuestion(4, 1)%></p>

		<input type="radio" value="A" name="Ans4" />A.
		<%=ReadExcel.readQuestion(4, 2)%>
		<br> <input type="radio" value="B" name="Ans4" />B.
		<%=ReadExcel.readQuestion(4, 3)%>
		<br> <input type="radio" value="C" name="Ans4" />C.
		<%=ReadExcel.readQuestion(4, 4)%>
		<br> <input type="radio" value="C" name="Ans4" />C.
		<%=ReadExcel.readQuestion(4, 5)%>
		<br>



		<p>
			5.<%=ReadExcel.readQuestion(5, 1)%></p>

		<input type="radio" value="A" name="Ans5" />A.
		<%=ReadExcel.readQuestion(5, 2)%>
		<br> <input type="radio" value="B" name="Ans5" />B.
		<%=ReadExcel.readQuestion(5, 3)%>
		<br> <input type="radio" value="C" name="Ans5" />C.
		<%=ReadExcel.readQuestion(5, 4)%>
		<br> <input type="radio" value="C" name="Ans5" />C.
		<%=ReadExcel.readQuestion(5, 5)%>
		<br>



		<p>
			6.<%=ReadExcel.readQuestion(6, 1)%></p>

		<input type="radio" value="A" name="Ans6" />A.
		<%=ReadExcel.readQuestion(6, 2)%>
		<br> <input type="radio" value="B" name="Ans6" />B.
		<%=ReadExcel.readQuestion(6, 3)%>
		<br> <input type="radio" value="C" name="Ans6" />C.
		<%=ReadExcel.readQuestion(6, 4)%>
		<br> <input type="radio" value="C" name="Ans6" />C.
		<%=ReadExcel.readQuestion(6, 5)%>
		<br>



		<p>
			7.<%=ReadExcel.readQuestion(7, 1)%></p>

		<input type="radio" value="A" name="Ans7" />A.
		<%=ReadExcel.readQuestion(7, 2)%>
		<br> <input type="radio" value="B" name="Ans7" />B.
		<%=ReadExcel.readQuestion(7, 3)%>
		<br> <input type="radio" value="C" name="Ans7" />C.
		<%=ReadExcel.readQuestion(7, 4)%>
		<br> <input type="radio" value="C" name="Ans7" />C.
		<%=ReadExcel.readQuestion(7, 5)%>
		<br>



		<p>
			8.<%=ReadExcel.readQuestion(8, 1)%></p>

		<input type="radio" value="A" name="Ans8" />A.
		<%=ReadExcel.readQuestion(8, 2)%>
		<br> <input type="radio" value="B" name="Ans8" />B.
		<%=ReadExcel.readQuestion(8, 3)%>
		<br> <input type="radio" value="C" name="Ans8" />C.
		<%=ReadExcel.readQuestion(8, 4)%>
		<br> <input type="radio" value="C" name="Ans8" />C.
		<%=ReadExcel.readQuestion(8, 5)%>
		<br>



		<p>
			9.<%=ReadExcel.readQuestion(9, 1)%></p>

		<input type="radio" value="A" name="Ans9" />A.
		<%=ReadExcel.readQuestion(9, 2)%>
		<br> <input type="radio" value="B" name="Ans9" />B.
		<%=ReadExcel.readQuestion(9, 3)%>
		<br> <input type="radio" value="C" name="Ans9" />C.
		<%=ReadExcel.readQuestion(9, 4)%>
		<br> <input type="radio" value="C" name="Ans9" />C.
		<%=ReadExcel.readQuestion(9, 5)%>
		<br>



		<p>
			10.<%=ReadExcel.readQuestion(10, 1)%></p>

		<input type="radio" value="A" name="Ans10" />A.
		<%=ReadExcel.readQuestion(10, 2)%>
		<br> <input type="radio" value="B" name="Ans10" />B.
		<%=ReadExcel.readQuestion(10, 3)%>
		<br> <input type="radio" value="C" name="Ans10" />C.
		<%=ReadExcel.readQuestion(10, 4)%>
		<br> <input type="radio" value="C" name="Ans10" />C.
		<%=ReadExcel.readQuestion(10, 5)%>
		<br> <br> <input type="submit" onclick="preventBack()" value="submit">

	</form>



<script>
// Set the date we're counting down to
var countDownDate = new Date("Jan 5, 2018 15:47:25").getTime();

// Update the count down every 1 second
var x = setInterval(function() {

    // Get todays date and time
    var now = new Date().getTime();
    
    // Find the distance between now an the count down date
    var distance = countDownDate - now;
    
    // Time calculations for days, hours, minutes and seconds
    
    var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
    var seconds = Math.floor((distance % (1000 * 60)) / 1000);
    
    // Output the result in an element with id="demo"
    document.getElementById("demo").innerHTML = minutes + "m " + seconds + "s ";
    
    // If the count down is over, write some text 
    if (distance < 0) {
        clearInterval(x);
        document.getElementById("demo").innerHTML = "EXPIRED";
    }
}, 1000);
</script>


</body>
</html>