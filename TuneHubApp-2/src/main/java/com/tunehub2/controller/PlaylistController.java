package com.tunehub2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tunehub2.entities.Playlist;
import com.tunehub2.entities.Songs;
import com.tunehub2.services.PlaylistService;
import com.tunehub2.services.SongService;

@Controller
public class PlaylistController {

	@Autowired
	PlaylistService pserv;
	
	@Autowired
	SongService sserv;
	
	@GetMapping("/createplaylist")
	public String createplaylist(Model model)
	{
		//Fetching songs from song service
		List<Songs> songslist = sserv.fetchAllSongs();
		
		//adding songs in model
		model.addAttribute("songslist",songslist);
		
		//sending createplaylist
		return "createplaylist";
	}
	
	@PostMapping("/addplaylist")
	public String addPlayList(@ModelAttribute Playlist playlist)
	{
		//System.out.println(playlist);// we get the songs that were added to playlist
		pserv.addPlayList(playlist);
		//update song table
		List<Songs>songsList = playlist.getSongs();
		for(Songs song : songsList)
		{
			song.getPlaylist().add(playlist);
			sserv.updateSong(song);
		}
		return "playlistsuccess";
		
	}
	
	@GetMapping("/viewPlaylists")
	public String viewPlaylists(Model model)
	{
		List<Playlist> plist = pserv.fetchPlaylists();
		//System.out.println(plist);
		model.addAttribute("plist",plist);
		return "viewPlaylists";
	}
}
