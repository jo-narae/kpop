package com.entertainment.kpop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MusicDTO {

    private String name;

    private Short track;

    private Boolean title;

    private LocalTime playTime;

    private int albumId;
}
