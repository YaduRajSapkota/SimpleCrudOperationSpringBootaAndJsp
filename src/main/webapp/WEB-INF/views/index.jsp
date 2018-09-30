<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="header.jsp"></jsp:include>
<title>Insert title here</title>

<body>




	<div class="signup-panel">
		<p style="text-align: center; color: #ffffff;">
			<span style="font-size: 28px;"><b>WELCOME</b></span><br>This
			Will Be An Amazing Experience
		</p>
		<form name="login" action="login" method="post">
			<div class="signup-panel-inner">
				<p>Login:</p>
				<div class="col-auto">

					<div class="input-group mb-3">
						<div class="input-group-prepend">
							<div class="input-group-text">
								<i class="fas fa-user  "></i>
							</div>
						</div>
						<input type="text" class="form-control" placeholder="Username"
							name="username">
					</div>
				</div>
				<div class="col-auto">

					<div class="input-group mb-3">
						<div class="input-group-prepend">
							<div class="input-group-text">
								<i class="fas fa-key  "></i>
							</div>
						</div>
						<input type="password" class="form-control" placeholder="Password"
							name="password">
					</div>
				</div>

				<div class="row">
					<div class="col-md-6">
						<input type="checkbox" name="remember-me">&nbsp; Remember
						me
					</div>
					<div class="col-md-6">
						<input type="submit" name="Login" class="btn btn-login">
					</div>
				</div>
				<br>
				<div class="row">
					<div class="col-md-6">
						<a href="adduser">Add User</a>
					</div>
					<!-- The Modal 1-->
				
					<div class="col-md-6">
						<a href="#"></a>
					</div>
				</div>
			</div>
		</form>
	</div>



</body>
</html>