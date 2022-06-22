package com.entertainment.kpop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ArtistDTO {

    private String name;

    private String img;

    private Date debutDate;

    private int agencyId;
}
