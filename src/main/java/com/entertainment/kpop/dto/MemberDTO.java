package com.entertainment.kpop.dto;

import com.entertainment.kpop.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MemberDTO {

    private String name;

    private Short age;

    private Member.Gender gender;

    private String position;

    private String img;

    private int artistId;
}
