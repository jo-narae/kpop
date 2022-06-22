package com.entertainment.kpop.controller;

import com.entertainment.kpop.domain.Artist;
import com.entertainment.kpop.domain.Member;
import com.entertainment.kpop.dto.MemberDTO;
import com.entertainment.kpop.service.ArtistService;
import com.entertainment.kpop.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    MemberService memberService;

    @Autowired
    ArtistService artistService;

    @GetMapping
    public List<Member> getMembers() {
        return memberService.findAll();
    }

    @GetMapping("/{id}")
    public Member getMember(@PathVariable("id") int id) {
        return memberService.findById(id);
    }

    @PostMapping
    public Member insertMember(@RequestBody MemberDTO dto) {
        Artist artist = artistService.findById(dto.getArtistId());
        Member member = new Member(0, dto.getName(), dto.getAge(), dto.getGender(), dto.getPosition(), dto.getImg(), artist);

        return memberService.save(member);
    }

    @PutMapping("/{id}")
    public Member updateMember(@PathVariable("id") int id, @RequestBody MemberDTO dto) {
        Member member = memberService.findById(id);
        Artist artist = artistService.findById(dto.getArtistId());

        member.setMember(dto.getName(), dto.getAge(), dto.getGender(), dto.getPosition(), dto.getImg(), artist);

        return memberService.save(member);
    }

    @DeleteMapping("/{id}")
    public void deleteMember(@PathVariable("id") int id) {
        memberService.delete(id);
    }
}
