package com.tunehub2.services;

import java.util.List;

import com.tunehub2.entities.Songs;


public interface SongService {

	public String addsong(Songs song);
	
	public boolean songExists(String name);

	public List<Songs> fetchAllSongs();

	public void updateSong(Songs song);

}
