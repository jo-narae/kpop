package com.entertainment.kpop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(nullable = false)
    private Short track;

    @Column(nullable = false)
    private Boolean title;

    @Column(name = "play_time")
    private LocalTime playTime;

    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;
}
