package com.ctrl;

import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entites.ToDo;


@Controller
public class HomeCtrl 
{
	@Autowired
	ServletContext context; 
	@RequestMapping("/home")
	public String home(Model m)
	{
		String str = "home";
		m.addAttribute("page",str);
		List<ToDo> list = (List<ToDo>)context.getAttribute("list");
		m.addAttribute("todos",list);
		return"home";
	}
	@RequestMapping("/add")
	public String addTodos(Model m)
	{
		ToDo t = new ToDo();
		String st = "add";
		m.addAttribute("page",st);
		m.addAttribute("todo",t);
		return"home";
	}
	@RequestMapping(value = "/saveTodo",method=RequestMethod.POST)
	public String saveTodo(@ModelAttribute("todo") ToDo t, Model m)
	{
		System.out.println(t);
		t.setTodoDate(new Date());
		
		@SuppressWarnings("unchecked")
		List<ToDo> list = (List<ToDo>) context.getAttribute("list");
		list.add(t);
		m.addAttribute("msg","Succesfully Added");
		return "home";
	}
}
