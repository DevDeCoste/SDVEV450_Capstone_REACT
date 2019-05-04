package com.sdev450_finalproject.persistance.Album;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Transactional
public interface AlbumRepository extends JpaRepository<AlbumEntity, Long> {

    Page<AlbumEntity> findAll(Pageable pageable);

    AlbumEntity findByAlbumNameEquals(String AlbumName);

    ArrayList<AlbumEntity> findAllByArtist(String ArtistName);
    


}