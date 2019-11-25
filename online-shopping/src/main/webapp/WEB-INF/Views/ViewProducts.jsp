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

						<script>
							window.categoryId = '';
						</script>

						<ol class="breadcrumb">
							<li><a Href="${contextroot}/home">Home</a></li>
							<li class="active">All Products</li>
						</ol>
					</c:if>

					<c:if test="${userClickCategoryProducts==true}">

						<script>
							window.categoryId = '${SelectedCategory.id}';
						</script>


						<ol class="breadcrumb">
							<li><a Href="${contextroot}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${SelectedCategory.name}</li>
						</ol>
					</c:if>




				</div>
			</div>

			<div class="row">

				<div class="col-xs-12">

					<table id="productListTable"
						class="table table-striped table borderd">

						<thead>

							<tr>
								<th></th>
								<th>Name</th>
								<th>Brand</th>
								<th>Price</th>
								<th>Qty. Available</th>
								<th></th>
							</tr>

						</thead>

						<tfoot>

							<tr>
								<th></th>
								<th>Name</th>
								<th>Brand</th>
								<th>Price</th>
								<th>Qty. Available</th>
								<th></th>
							</tr>

						</tfoot>
					</table>

				</div>

			</div>

		</div>



	</div>






</div>