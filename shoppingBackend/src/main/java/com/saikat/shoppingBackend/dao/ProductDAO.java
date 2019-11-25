package com.saikat.shoppingBackend.dao;

import java.util.List;

import com.saikat.shoppingBackend.dto.Category;
import com.saikat.shoppingBackend.dto.Product;

public interface ProductDAO {
	
	Product get(int productID);
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);
	List<Product> list();
	
	List<Product> listActiveProducts();
	List<Product> listActiveProductsByCategory(int CategoryId);
	List<Product> getLatestActiveProducts(int count);
	

}
