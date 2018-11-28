package com.eLearning.eLearning.service;

import com.eLearning.eLearning.model.Candidate;
import com.eLearning.eLearning.repository.CandidateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {
    private final CandidateRepository candidateRepository;

    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public List<Candidate> findAll() {
        return this.candidateRepository.findAll();
    }



    public Candidate create(Candidate inscription) {
        return this.candidateRepository.save(inscription);
    }
    
    public Candidate update(Candidate inscription) {
        return this.candidateRepository.save(inscription);
    }
    

    public Candidate findById(long id) {
        return this.candidateRepository.findById(id).orElse(null);
    }
    
   /* public List<Candidate> findAllByInscription(long id) {
        return this.candidateRepository.findAllByIdInscription(id);
    }

    */

    public void delete(Long id) {
        this.candidateRepository.deleteById(id);
    }

}
