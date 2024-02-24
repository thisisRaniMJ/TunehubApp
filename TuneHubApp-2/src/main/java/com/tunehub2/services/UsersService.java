package com.tunehub2.services;


import com.tunehub2.entities.UsersTuneHubEntity;

public interface UsersService {
	
	public String addUser(UsersTuneHubEntity user);
	
	public boolean emailExists(String email);

	public boolean validateUser(String email, String password);
	
	public String getRole(String email);

	public UsersTuneHubEntity getUser(String email);
	
	public void updateUser(UsersTuneHubEntity user);
}
