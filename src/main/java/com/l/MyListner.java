package com.l;

import java.util.ArrayList;
import java.util.List;
import com.entites.*;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListner implements ServletContextListener{
	
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Context Created");
		List<ToDo> list = new ArrayList<ToDo>();
		ServletContext context = sce.getServletContext();
		context.setAttribute("list", list);
	}
	
	public void contextDestroyed(ServletContextEvent sce) {
		
		
	}
	
}
