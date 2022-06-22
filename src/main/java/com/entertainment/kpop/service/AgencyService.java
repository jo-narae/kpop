package com.entertainment.kpop.service;

import com.entertainment.kpop.domain.Agency;
import com.entertainment.kpop.repository.AgencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AgencyService {

    @Autowired
    AgencyRepository agencyRepository;

    // 전체 조회
    public List<Agency> findAll() {
        return agencyRepository.findAll();
    }

    // 특정 아이디로 조회
    public Agency findById(int id) {
        return agencyRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    // Upsert
    public Agency save(Agency agency) {
        return agencyRepository.save(agency);
    }

    // 삭제
    public void delete(int id) {
        agencyRepository.deleteById(id);
    }
}
