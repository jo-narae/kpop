package com.entertainment.kpop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AlbumDTO {

    private String name;

    private String releseDate;

    private int artistId;
}
