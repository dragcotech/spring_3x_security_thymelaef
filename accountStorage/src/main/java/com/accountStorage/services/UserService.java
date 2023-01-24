package com.accountStorage.services;

import java.util.List;

import com.accountStorage.model.User;
import com.accountStorage.model.UserDto;

public interface UserService {
	
	void registerUser(UserDto userDto);
	
	void configUser(String username);
	
	void deleteUser(String username);
	
	User findUserByUsername(String username);
	
	List<UserDto> findAllUsers();
}
