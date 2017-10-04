package com.hibernatepractice.service;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UserService m = new UserService();
		m.createUsers();
		m.displayUsers();
	}

}
