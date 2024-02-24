package com.tunehub2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunehub2.entities.Songs;
import com.tunehub2.repositories.SongRepository;


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
