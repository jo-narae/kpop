package com.entertainment.kpop.controller;

import com.entertainment.kpop.domain.Agency;
import com.entertainment.kpop.service.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agencies")
public class AgencyController {

    @Autowired
    AgencyService agencyService;

    @GetMapping
    public List<Agency> getAgencies() {
        return agencyService.findAll();
    }

    @GetMapping("/{id}")
    public Agency getAgency(@PathVariable("id") int id) {
        return agencyService.findById(id);
    }

    @PostMapping
    public Agency insertAgency(@RequestBody Agency agency) {
        return agencyService.save(agency);
    }

    @PutMapping("/{id}")
    public Agency updateAgency(@PathVariable("id") int id, @RequestBody Agency req) {
        Agency agency = agencyService.findById(id);
        agency.setAgency(req.getName(), req.getCeo(), req.getAddress(), req.getImg());

        return agencyService.save(agency);
    }

    @DeleteMapping("/{id}")
    public void deleteAgency(@PathVariable("id") int id) {
        agencyService.delete(id);
    }
}
