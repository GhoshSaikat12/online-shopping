<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page isELIgnored="false"%>

<spring:url var="css" value="/resources/css" />
<c:set var="contextroot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping - ${title}</title>

<script>
	window.menu = '${title}';
	window.contextRoot = '${contextroot}';
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap dataTable CSS -->
<link href="${css}/dataTables.bootstrap.css" rel="stylesheet">

<!-- Bootstrap theme CSS -->
<link href="${css}/bootstrap-simplex-theme.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myApp.css" rel="stylesheet">

</head>

<body>
	<div class="wrapper">
		<!-- Navigation Bar comes here-->
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
			<div class="container">
				<div class="navbar-header">
					<a class="navbar-brand" href="${contextroot}/home">Online
						Shopping-Home</a>
				</div>

			</div>
		</nav>

		<div class="content">

			<div class="container">

				<div class="row">


					<div class="col-xs-12">

						<div class="jumbotron">

							<h1>${errorTitle}</h1>
							<hr />

							<blockquote>${errorDescription}</blockquote>

						</div>


					</div>



				</div>


			</div>


		</div>


		<!-- Footer comes here -->
		<%@include file="./Shared/Footer.jsp"%>

		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.js"></script>
		<script src="${js}/bootstrap.min.js"></script>

		<!-- Self Coded JavaScript -->
		<script src="${js}/myApp.js"></script>

	</div>
</body>

</html>
