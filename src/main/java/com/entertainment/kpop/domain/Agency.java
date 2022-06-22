package com.entertainment.kpop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Agency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String ceo;

    @Column(length = 100, nullable = false)
    private String address;

    private String img;

    public Agency setAgency(String name, String ceo, String address, String img) {
        this.name = name;
        this.ceo = ceo;
        this.address = address;
        this.img = img;

        return this;
    }
}
