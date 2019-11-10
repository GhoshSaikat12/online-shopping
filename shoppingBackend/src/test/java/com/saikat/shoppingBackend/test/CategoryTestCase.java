package com.saikat.shoppingBackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.saikat.shoppingBackend.dao.CategoryDAO;
import com.saikat.shoppingBackend.dto.Category;

public class CategoryTestCase {
	
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	@BeforeClass
	public static void init() {
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.saikat.shoppingBackend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("CategoryDAO");
	}
	
//	@Test
//	public void testAddCategory() {
//		
//		category = new Category();
//		category.setName("Television");
//		category.setDescription("This is a description for Television Category");
//		category.setImageURL("Cat_5.png");
//		category.setActive(true);
//		
//		assertEquals("Succesfuly added category into the table.", true,categoryDAO.add(category));
//	}
	
	/*
	 * @Test public void testGetCategory() {
	 * 
	 * category = categoryDAO.get(3);
	 * 
	 * assertEquals("Succesfuly Fecthed a single category from the table.",
	 * "Laptop",category.getName()); }
	 */
	
	
	  @Test public void testUpdateCategory() {
	  
	  category = categoryDAO.get(3);
	  
	  category.setActive(true);
	  
	  assertEquals("Succesfuly Updated category into the table.",
	  true,categoryDAO.update(category)); }
	 
	/*
	 * @Test public void testDeleteCategory() {
	 * 
	 * category = categoryDAO.get(3);
	 * 
	 * assertEquals("Succesfuly Deleted category from the table.",
	 * true,categoryDAO.delete(category)); }
	 */
	
	/*
	 * @Test public void testGetAllActiveCategory() {
	 * 
	 * assertEquals("Succesfuly Fetched All Active category from the table.",
	 * 1,categoryDAO.list().size()); }
	 */
}
