package com.tunehub2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunehub2.entities.Playlist;
import com.tunehub2.repositories.PlaylistRepository;

@Service
public class PlaylistServiceImplementation implements PlaylistService{
	@Autowired
	PlaylistRepository prepo;
	
	@Override
	public void addPlayList(Playlist playlist) {
		prepo.save(playlist);
	}

	@Override
	public List<Playlist> fetchPlaylists() {
		return prepo.findAll();
	}
	
}
