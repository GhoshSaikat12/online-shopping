package com.saikat.shoppingBackend.dao;

import java.util.List;

import com.saikat.shoppingBackend.dto.Category;

public interface CategoryDAO {
	
	Category get(int id);
	
	List<Category> list();
	
	boolean add(Category category);
	
	boolean update(Category category);
	
	boolean delete(Category category);
	

}
