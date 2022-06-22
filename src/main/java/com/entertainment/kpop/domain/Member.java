package com.entertainment.kpop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(nullable = false)
    private Short age;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    @Column(length = 100, nullable = false)
    private String position;

    private String img;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;

    public enum Gender {
        Man,
        Woman
    }

    public Member setMember(String name, Short age, Gender gender, String position, String img, Artist artist) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.position = position;
        this.img = img;
        this.artist = artist;

        return this;
    }
}
