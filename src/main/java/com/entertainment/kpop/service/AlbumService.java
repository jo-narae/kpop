package com.entertainment.kpop.service;

import com.entertainment.kpop.domain.Album;
import com.entertainment.kpop.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AlbumService {

    @Autowired
    AlbumRepository albumRepository;

    public List<Album> findAll() {
        return albumRepository.findAll();
    }

    public Album findById(int id) {
        return albumRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public Album save(Album album) {
        return albumRepository.save(album);
    }

    public void delete(int id) {
        albumRepository.deleteById(id);
    }
}
