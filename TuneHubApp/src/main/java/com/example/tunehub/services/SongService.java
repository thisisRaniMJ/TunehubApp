package com.example.tunehub.services;

import java.util.List;

import com.example.tunehub.entities.Songs;

public interface SongService {

	public String addsong(Songs song);
	
	public boolean songExists(String name);

	public List<Songs> fetchAllSongs();

	public void updateSong(Songs song);

}
