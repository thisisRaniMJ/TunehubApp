package com.tunehub2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tunehub2.entities.Songs;

public interface SongRepository extends JpaRepository<Songs, Integer>{
	
	public Songs findByName(String name);

}
