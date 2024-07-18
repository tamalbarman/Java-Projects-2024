package com.bengalbuzz.dao;

public interface UserDao {

	boolean isValidUser(String username, String password);

	boolean addUser(User user);

}
