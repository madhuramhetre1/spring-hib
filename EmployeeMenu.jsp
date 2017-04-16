<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${sessionScope.user123.role}:${sessionScope.user123.username}<br/>
<a href="../consignee/registc">Consignment</a><br/>
<a href="../consignee/list1">Delivery Details</a><br/>
<!-- <a href="../loginController/loginconsumer">Reports</a><br/>
<a href="../loginController/loginconsumer">Track</a><br/> -->

</body>
</html>