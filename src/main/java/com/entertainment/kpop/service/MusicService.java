package com.entertainment.kpop.service;

import com.entertainment.kpop.domain.Music;
import com.entertainment.kpop.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class MusicService {

    @Autowired
    MusicRepository musicRepository;

    public List<Music> findAll() {
        return musicRepository.findAll();
    }

    public Music findById(int id) {
        return musicRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public Music save(Music music) {
        return musicRepository.save(music);
    }

    public void delete(int id) {
        musicRepository.deleteById(id);
    }
}
