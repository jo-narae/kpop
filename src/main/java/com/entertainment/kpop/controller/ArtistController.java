package com.entertainment.kpop.controller;

import com.entertainment.kpop.domain.Agency;
import com.entertainment.kpop.domain.Artist;
import com.entertainment.kpop.dto.ArtistDTO;
import com.entertainment.kpop.service.AgencyService;
import com.entertainment.kpop.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artists")
public class ArtistController {

    @Autowired
    ArtistService artistService;

    @Autowired
    AgencyService agencyService;

    @GetMapping
    public List<Artist> getArtists() {
        return artistService.findAll();
    }

    @GetMapping("/{id}")
    public Artist getArtist(@PathVariable("id") int id) {
        return artistService.findById(id);
    }

    @PostMapping
    public Artist insertArtist(@RequestBody ArtistDTO dto) {
        Agency agency = agencyService.findById(dto.getAgencyId());
        Artist artist = new Artist(0, dto.getName(), dto.getImg(), dto.getDebutDate(), agency);

        return artistService.save(artist);
    }

    @PutMapping("/{id}")
    public Artist updateArtist(@PathVariable("id") int id, @RequestBody ArtistDTO dto) {
        Artist artist = artistService.findById(id);
        Agency agency = agencyService.findById(dto.getAgencyId());

        artist.setArtist(dto.getName(), dto.getImg(), dto.getDebutDate(), agency);

        return artistService.save(artist);
    }

    @DeleteMapping("/{id}")
    public void deleteArtist(@PathVariable("id") int id) {
        artistService.delete(id);
    }
}
