package com.tunehub2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tunehub2.entities.Playlist;

public interface PlaylistRepository extends JpaRepository<Playlist, Integer>{

}
