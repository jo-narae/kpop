package com.entertainment.kpop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(name = "relese_date", nullable = false)
    private String releseDate;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;
}
