package com.example.tunehub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tunehub.entities.Songs;
import com.example.tunehub.repositories.SongRepository;

@Service
public class SongServiceImplementation implements SongService{
	@Autowired
	SongRepository srepo;

	@Override
	public String addsong(Songs song) {
		srepo.save(song);
		return "Song is added";
	}

	@Override
	public boolean songExists(String name) {
		Songs song = srepo.findByName(name);
		if(song == null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	@Override
	public List<Songs> fetchAllSongs() {
		 List<Songs> songsList = srepo.findAll();
		 return songsList;
	}
	
	@Override
	public void updateSong(Songs song) {
		srepo.save(song);
	}
}
