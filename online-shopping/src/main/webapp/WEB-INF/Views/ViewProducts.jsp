<div class="container">

	<div class="row">

		<!-- To display sidemenu -->
		<div class="col-md-3">

			<%@include file="./Shared/sideMenu.jsp"%>

		</div>

		<!-- To display Products -->
		<div class="col-md-9">

			<div class="row">
				<div class="col-lg-9">

					<c:if test="${userClickAllProducts==true}">

						<ol class="breadcrumb">
							<li><a Href="${contextroot}/home">Home</a></li>
							<li class="active">All Products</li>
						</ol>
					</c:if>
					
					<c:if test="${userClickCategoryProducts==true}">

						<ol class="breadcrumb">
							<li><a Href="${contextroot}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${SelectedCategory.name}</li>
						</ol>
					</c:if>




				</div>
			</div>



		</div>



	</div>






</div>