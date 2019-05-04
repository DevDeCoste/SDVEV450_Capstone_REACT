package com.sdev450_finalproject.persistance;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Transactional
public interface ArtistRepository extends JpaRepository<ArtistEntity, Long> {

    Page<ArtistEntity> findAll(Pageable pageable);

    ArrayList<ArtistEntity> findArtistEntitiesByAlbumTitleContains(String AlbumName);

//ArrayList<ArtistEntity>findArtistEntitiesByArtistName(String ArtistName);

ArrayList<ArtistEntity>findAllByArtistName(String ArtistName);
}




