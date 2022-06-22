package com.entertainment.kpop.service;

import com.entertainment.kpop.domain.Artist;
import com.entertainment.kpop.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ArtistService {

    @Autowired
    ArtistRepository artistRepository;

    // 전체 조회
    public List<Artist> findAll() {
        return artistRepository.findAll();
    }

    // 특정 아이디로 조회
    public Artist findById(int id) {
        return artistRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    // Upsert
    public Artist save(Artist artist) {
        return artistRepository.save(artist);
    }

    // 삭제
    public void delete(int id) {
        artistRepository.deleteById(id);
    }
}
