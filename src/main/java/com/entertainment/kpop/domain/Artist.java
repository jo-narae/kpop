package com.entertainment.kpop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50, nullable = false)
    private String name;

    private String img;

    @Temporal(TemporalType.DATE)
    @Column(name = "debut_date")
    private Date debutDate;

    @ManyToOne
    @JoinColumn(name = "agency_id", nullable = false)
    private Agency agency;

    public Artist setArtist(String name, String img, Date debutDate, Agency agency) {
        this.name = name;
        this.img = img;
        this.debutDate = debutDate;
        this.agency = agency;

        return this;
    }
}
