 package com.tunehub2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tunehub2.entities.Songs;
import com.tunehub2.services.SongService;

@Controller
public class SongsController {
	@Autowired
	SongService songv;
	
	@PostMapping("/addsongs")
	public String addSongs(@ModelAttribute Songs song)
	{
		boolean status = songv.songExists(song.getName());
		if(status == false)
		{
			songv.addsong(song);
			return "songsuccess";
		}
		else
		{
			return "songfail";
		}
	}
	@GetMapping("/map-viewsongs")
	public String viewSongs(Model model)
	{
		List<Songs> songsList = songv.fetchAllSongs();
		model.addAttribute("songsList",songsList);
		return "displaysongs";
	}
	@GetMapping("/viewsongs")
	public String viewCustomerSongs(Model model)
	{
		boolean primeCustomerstatus = true;
		
		if (primeCustomerstatus == true)
		{
			List<Songs> songsList = songv.fetchAllSongs();
			model.addAttribute("songsList",songsList);
			return "displaysongs";
		}
		else
		{
			return "makepayment";
		}
	}
}
