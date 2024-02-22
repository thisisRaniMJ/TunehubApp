package com.example.tunehub.services;

import java.util.List;

import com.example.tunehub.entities.Playlist;

public interface PlaylistService {
	
	public void addPlayList(Playlist playlist);

	public List<Playlist> fetchPlaylists();

}
