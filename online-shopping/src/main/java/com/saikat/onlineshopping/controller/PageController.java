package com.saikat.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.saikat.shoppingBackend.dao.CategoryDAO;
import com.saikat.shoppingBackend.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index() {
		ModelAndView mv =new ModelAndView("Page");
		mv.addObject("title","Home");
		mv.addObject("userHomeClick",true);
		
		mv.addObject("Categories",categoryDAO.list());
		return mv;
	}
	
	@RequestMapping(value= "about")
	public ModelAndView about() {
		ModelAndView mv =new ModelAndView("Page");
		mv.addObject("title","About");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	
	@RequestMapping(value= "contacts")
	public ModelAndView contacts() {
		ModelAndView mv =new ModelAndView("Page");
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact",true);
		return mv;
	}
	
	/*
	 * Methods to show all products and Basedon Categories
	 */
	
	@RequestMapping(value= "show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mv =new ModelAndView("Page");
		mv.addObject("title","All Products");
		mv.addObject("userClickAllProducts",true);
		
		mv.addObject("Categories",categoryDAO.list());
		return mv;
	}
	
	@RequestMapping(value= "show/category/{id}/products")
	public ModelAndView showAllProducts(@PathVariable("id")int id) {
		ModelAndView mv =new ModelAndView("Page");
		
		//fetch single category from list
		Category category= new Category();
		category = categoryDAO.get(id);
		
		//Adding Category name to title
		mv.addObject("title",category.getName());
		mv.addObject("userClickCategoryProducts",true);
		
		//Passing the category list
		mv.addObject("Categories",categoryDAO.list());
		
		//Passing the selected category
		mv.addObject("SelectedCategory",category);
		
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
	//Test Methods
	@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam(value="greeting",required=false)String greeting) {
		ModelAndView mv =new ModelAndView("Page");
		if(greeting==null) {
			greeting= "Hello Everyone";
		}
		mv.addObject("greeting",greeting);
		return mv;
	}
	
	@RequestMapping(value="/test/{greeting}")
	public ModelAndView testClean(@PathVariable("greeting")String greeting) {
		ModelAndView mv =new ModelAndView("Page");
		if(greeting==null) {
			greeting= "Hello Everyone";
		}
		mv.addObject("greeting",greeting);
		return mv;
	}
}
