
<%@ page contentType="text/html; charset=utf-8" language="java"
	import="javax.xml.parsers.DocumentBuilderFactory,javax.xml.parsers.DocumentBuilder,org.w3c.dom.*"
	errorPage=""%>
<%
	DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

	DocumentBuilder db = dbf.newDocumentBuilder();

	Document doc = db.parse("/home/vamsoft/Desktop/Name.xml");

	NodeList RegistrationNo = doc.getElementsByTagName("RegistrationNo");
	NodeList StudentId = doc.getElementsByTagName("StudentID");
	NodeList Name = doc.getElementsByTagName("Name");
	NodeList FName = doc.getElementsByTagName("FName");
%>

<html>
<head>
<title>Read Xml Data</title>
</head>

<body>
	<table border="1">
		<%
			int i;
			for (i = 0; i <= RegistrationNo.getLength() - 1; i++) {
		%>

		<tr>
			<td><%=RegistrationNo.item(i).getFirstChild().getNodeValue()%></td>
			<td><%=StudentId.item(i).getFirstChild().getNodeValue()%></td>
			<td><%=Name.item(i).getFirstChild().getNodeValue()%></td>
			<td><%=FName.item(i).getFirstChild().getNodeValue()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>