<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page isELIgnored="false"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />
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
	window.contextRoot ='${contextroot}';
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
		<%@include file="./Shared/navbar.jsp"%>

		<div class="content">
			<!-- Page Content -->
			<c:if test="${userHomeClick==true }">
				<%@include file="./Home.jsp"%>
			</c:if>

			<!-- Load when user clicks About -->
			<c:if test="${userClickAbout==true }">
				<%@include file="./About.jsp"%>
			</c:if>

			<!-- Load when user clicks Contact -->
			<c:if test="${userClickContact==true }">
				<%@include file="./Contact.jsp"%>
			</c:if>
			
			<!-- Load when user clicks View Products -->
			<c:if test="${userClickAllProducts==true or userClickCategoryProducts==true}">
				<%@include file="./ViewProducts.jsp"%>
			</c:if>
			
			<!-- Load when user clicks Single Product -->
			<c:if test="${userClickShowProduct==true}">
				<%@include file="./SingleProduct.jsp"%>
			</c:if>

		</div>


		<!-- Footer comes here -->
		<%@include file="./Shared/Footer.jsp"%>

		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.js"></script>
		<script src="${js}/bootstrap.min.js"></script>
		
		<!-- DataTables -->
		<script src="${js}/jquery.dataTables.js"></script>
		<script src="${js}/dataTables.bootstrap.js"></script>
		
		<!-- Self Coded JavaScript -->
		<script src="${js}/myApp.js"></script>

	</div>
</body>

</html>
