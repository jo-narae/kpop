package com.entertainment.kpop.service;

import com.entertainment.kpop.domain.Member;
import com.entertainment.kpop.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    public Member findById(int id) {
        return memberRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public Member save(Member member) {
        return memberRepository.save(member);
    }

    public void delete(int id) {
        memberRepository.deleteById(id);
    }
}
