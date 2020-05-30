package com.entites;

import java.util.Date;

public class ToDo {
	private String todoTitle;
	private String todoContent;
	private Date todoDate;

	public ToDo()
	{
		super();
	}
	public ToDo(String todoTitle, String todoContent, Date todoDate) {
		super();
		this.todoTitle = todoTitle;
		this.todoContent = todoContent;
		this.todoDate = todoDate;
	}
	@Override
	public String toString() {
		return this.getTodoTitle() + " " + this.getTodoContent();
	}
	public String getTodoTitle() {
		return todoTitle;
	}
	public void setTodoTitle(String todoTitle) {
		this.todoTitle = todoTitle;
	}
	public String getTodoContent() {
		return todoContent;
	}
	public void setTodoContent(String todoContent) {
		this.todoContent = todoContent;
	}
	public Date getTodoDate() {
		return todoDate;
	}
	public void setTodoDate(Date todoDate) {
		this.todoDate = todoDate;
	}
}
