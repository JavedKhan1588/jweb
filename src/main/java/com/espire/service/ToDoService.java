package com.espire.service;

import java.util.ArrayList;
import java.util.List;

import com.espire.model.ToDo;

public class ToDoService {
	private static List<ToDo> todos = new ArrayList<ToDo>();
	static {
		todos.add(new ToDo("Learning Servlet and JSP"));
		todos.add(new ToDo("Learning Spring"));
		todos.add(new ToDo("Learning REST Service"));
	}
	public List<ToDo> retrieveToDos(){
		return todos;
	}
}
