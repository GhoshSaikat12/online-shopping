package com.saikat.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index() {
		ModelAndView mv =new ModelAndView("Page");
		mv.addObject("title","Home");
		mv.addObject("userHomeClick",true);
		return mv;
	}
	
	@RequestMapping(value= "about")
	public ModelAndView about() {
		ModelAndView mv =new ModelAndView("Page");
		mv.addObject("title","About");
		mv.addObject("userHomeAbout",true);
		return mv;
	}
	
	@RequestMapping(value= "contacts")
	public ModelAndView contacts() {
		ModelAndView mv =new ModelAndView("Page");
		mv.addObject("title","Contact Us");
		mv.addObject("userHomeContact",true);
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
