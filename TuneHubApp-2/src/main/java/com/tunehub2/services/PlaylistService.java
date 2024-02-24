package com.tunehub2.services;

import java.util.List;

import com.tunehub2.entities.Playlist;

public interface PlaylistService {

	public void addPlayList(Playlist playlist);

	public List<Playlist> fetchPlaylists();

}
