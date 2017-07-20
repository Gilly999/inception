package com.myproject.aem.core.servlets;

import java.io.IOException;

import javax.servlet.ServletException;

import org.apache.jackrabbit.oak.plugins.memory.DoublePropertyState;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;

public class ServletDemo extends SlingSafeMethodsServlet {
	
	/**
	 * 
	 */
	
	
	private static final long serialVersionUID = 1L;	
	@Override
	protected void doGet(SlingHttpServletRequest req, SlingHttpServletResponse resp)
										throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
}