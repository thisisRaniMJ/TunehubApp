package com.tunehub2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tunehub2.entities.UsersTuneHubEntity;

public interface UsersRepository extends JpaRepository<UsersTuneHubEntity, Integer>{
	
	public UsersTuneHubEntity findByEmail(String email);
}
