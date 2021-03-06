<div class="container">
	<div class="row">
		<div class="col-xs-12">
			<ol class="breadcrumb">
				<li><a href="${contextroot}/home">Home</a></li>
				<li><a href="${contextroot}/show/all/products">Products</a></li>
				<li class="active">${product.name}</li>
			</ol>
		</div>
	</div>


	<div class="row">
		<!-- Display Product Images -->
		<div class="col-xs-12 col-sm-4">
			<div class="thumbnail">

				<img src="${images}/${product.code}.jpg" class="img img-responsive" />

			</div>

		</div>
		<!-- Display Product Description -->
		<div class="col-xs-12 col-sm-8">

			<h3>${product.name}</h3>
			<hr />

			<p>${product.description}</p>
			<hr />

			<h4>
				Price: <strong> &#8377; ${product.unitPrice} /-</strong>
			</h4>
			<hr />



			<c:choose>

				<c:when test="${product.quantity <1 }">

					<h6>
						Qty. Available : <span style="color: red"> Out Of Stock!</span>
					</h6>

					<a href="javascript.void(0)" class="btn btn-success disabled">
						<span class="glyphicon glyphicon-shopping-cart"><strike>Add
								to Cart</strike></span>
					</a>
				</c:when>
				<c:otherwise>

					<h6>Qty. Available : ${product.quantity}</h6>

					<a href="${contextroot}/cart/add/${product.id}/product"
						class="btn btn-success"> <span
						class="glyphicon glyphicon-shopping-cart">Add to Cart</span>
					</a>

				</c:otherwise>


			</c:choose>

			<a href="${contextroot}/show/all/products" class="btn btn-success">
				Back </a>

		</div>


	</div>
</div>