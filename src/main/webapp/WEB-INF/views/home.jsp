
<html><%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="header.jsp"></jsp:include>
</head>
<body>

	<br>

	<h1>Welcome</h1>

	<div class="container">
		<a href="addclient" class="btn btn-info" role="button">Add
			Client</a> &nbsp; <a href="/" class="btn btn-info" role="button">
			Logout</a><br>&nbsp;
			<c:if test="${!empty clients }">
		
			<table class="table">
				<thead>
					<tr>
						<th>Serial no</th>
						<th>Client Name</th>
						<th>Address</th>
						<th>Phone No</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${clients }" var="st" varStatus="c">
					<tr>
						<td>${c.count}</td>
						<td>${st.clientName }</td>
						<td>${st.address }</td>
						<td>${st.phoneNo}</td>
						<td><a href="clientEdit/${st.id }">Edit </a> | <a
															href="clientDelete/${st.id}"
															onclick="return confirm('Are sure you want to delete ?');">Delete

														</a></td>

					</tr>
					</c:forEach>

				</tbody>
			</table>
		</c:if>
	</div>



</body>
</html>