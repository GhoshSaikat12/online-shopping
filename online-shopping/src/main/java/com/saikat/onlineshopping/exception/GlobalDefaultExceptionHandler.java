package com.saikat.onlineshopping.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handlerNoHandlerFoundException() {
		
		ModelAndView mv= new ModelAndView("Error");
		
		mv.addObject("errorTitle","This page is not constructed");
		
		mv.addObject("errorDescription","This page you are looking for is not available now!");
		
		mv.addObject("title","404 Error Page");
		
		return mv;
	}
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ModelAndView handlerProductNotFoundException() {
		
		ModelAndView mv= new ModelAndView("Error");
		
		mv.addObject("errorTitle","This product is not constructed");
		
		mv.addObject("errorDescription","The product you are looking for is not available right now!");
		
		mv.addObject("title","Product Unavailable");
		
		return mv;
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handlerProductNotFoundException(Exception ex) {
		
		ModelAndView mv= new ModelAndView("Error");
		
		mv.addObject("errorTitle","Something went wrong!");
		
		
		/*
		 * Only For debugging purpose
		 * StringWriter sw= new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
		
			ex.printStackTrace(pw);
		
		
			mv.addObject("errorDescription",sw.toString());
		 */
		
		mv.addObject("errorDescription",ex.toString());
		
		mv.addObject("title","Something Went Wrong!");
		
		return mv;
	}
	
	

}
