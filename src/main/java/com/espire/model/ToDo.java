package com.espire.model;

public class ToDo {

	public String name;

	public ToDo(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("ToDo [name=%s]", name);
	}
}
