
<h1 class="my-4">Shop Name</h1>

<div class="list-group">

	<c:forEach items="${Categories}" var="Category">
		<a href="${contextroot}/show/category/${Category.id}/products" class="list-group-item" id="a_${Category.name}">${Category.name}</a>
	</c:forEach>
	
</div>