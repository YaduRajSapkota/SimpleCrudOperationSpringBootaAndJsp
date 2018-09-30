<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="header.jsp"></jsp:include>
</head>
<body>


	<div class="signup-panel">
<p style="text-align: center; color: #ffffff;">
			<span style="font-size: 28px;"><b>Update Client</b></span>
		</p>
		<form action="updateClient" method="post" name="updateClient">
			<div class="signup-panel-inner">
				<p>Edit Client:</p>
				<div class="col-auto">
				<div class="input-group mb-3">
						<div class="input-group-prepend">
							<div class="input-group-text">
								<i class="fas fa-user  "></i>
							</div>
						</div>
						<input type="text" class="form-control" placeholder="id"
							name="id" value="${client.id} " readonly="readonly">
					</div>

					<div class="input-group mb-3">
						<div class="input-group-prepend">
							<div class="input-group-text">
								<i class="fas fa-user  "></i>
							</div>
						</div>
						<input type="text" class="form-control" placeholder="client name"
							name="clientName" value="${client.clientName}">
					</div>
				</div>
				<div class="col-auto">

					<div class="input-group mb-3">
						<div class="input-group-prepend">
							<div class="input-group-text">
								<i class="fas fa-key  "></i>
							</div>
						</div>
						<input type="text" class="form-control" placeholder="address"
							name="address" value="${client.address}">
					</div>
				</div>
				<div class="col-auto">

					<div class="input-group mb-3">
						<div class="input-group-prepend">
							<div class="input-group-text">
								<i class="fas fa-key  "></i>
							</div>
						</div>
						<input type="text" class="form-control" placeholder="phone no"
							name="phoneNo" value="${client.phoneNo}">
					</div>
				</div>

				<div class="row">

					<div class="col-md-6">
						<input type="submit" name="Login" class="btn btn-login">
					</div>
				</div>
				<br>

			</div>
		</form>
	</div>

</body>
</html>