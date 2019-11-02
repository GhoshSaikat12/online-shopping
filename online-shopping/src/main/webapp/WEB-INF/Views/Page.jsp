<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page isELIgnored="false"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/Images" />
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
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap theme CSS -->
<link href="${css}/bootstrap-simplex-theme.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myApp.css" rel="stylesheet">

</head>

<body>
	<div class="wrapper">
		<!-- Navigation Bar comes here-->
		<%@include file="./Shared/navbar.jsp"%>

		<div class="content">
			<!-- Page Content -->
			<c:if test="${userHomeClick==true }">
				<%@include file="./Home.jsp"%>
			</c:if>

			<!-- Load when user clicks About -->
			<c:if test="${userHomeAbout==true }">
				<%@include file="./About.jsp"%>
			</c:if>

			<!-- Load when user clicks Contact -->
			<c:if test="${userHomeContact==true }">
				<%@include file="./Contact.jsp"%>
			</c:if>

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
