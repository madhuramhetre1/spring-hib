<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${sessionScope.user123.role}:${sessionScope.user123.username}
	<table border="1">
		<c:forEach var="cons" items="${requestScope.consignment_list}">
			<tr>
				<td>${cons.consignmentId}</td>
				<td>${cons.consigneeName}</td>
				<%-- <td>${cons.consigneeMobileno}</td> --%>
	            <td><a href="updateC/${cons.consignmentId}">Update</a></td>
				<td><a href="deleteC/${cons.consignmentId}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html> 