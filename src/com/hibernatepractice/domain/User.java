package com.hibernatepractice.domain;

public final class User {
	
	private int id;
	private String name;
	private String surname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;

	}
	
	@Override
	public String toString() {
		return new StringBuilder("User : ")
		.append("id = " + this.id)
		.append(", ")
		.append("name = " + this.name)
		.append(", ")
		.append("surname = " + this.surname)
		.toString();
	}
}
