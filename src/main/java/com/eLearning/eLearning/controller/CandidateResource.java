package com.eLearning.eLearning.controller;

import com.eLearning.eLearning.model.Candidate;
import com.eLearning.eLearning.service.CandidateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/candidates")
public class CandidateResource {

    private final CandidateService candidateService;

    public CandidateResource(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping("/{id}")
    public List<Candidate> findAll(@PathVariable int id) {
        return this.candidateService.findAll();
    }

   /*
    @GetMapping("/inscriptions/{id}")
    public List<Candidate> findAllByInscription(@PathVariable Long id) {
        return this.candidateService.findAllByInscription(id);
    }

    
    @GetMapping("/{id}")
    public Candidate findById(@PathVariable Long id) {
        return this.candidateService.findById(id);
    }
    
    @PostMapping
    public Candidate create(@PathVariable Candidate candidate) {
        return this.candidateService.create(candidate);
    }
    @PutMapping
    public Candidate update(@PathVariable Candidate candidate) {
        return this.candidateService.update(candidate);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.candidateService.delete(id);
    }
    */
}
