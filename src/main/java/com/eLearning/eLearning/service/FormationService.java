package com.eLearning.eLearning.service;

import com.eLearning.eLearning.model.Formation;
import com.eLearning.eLearning.repository.FormationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FormationService {
    private final FormationRepository formationRepository;

    public FormationService (FormationRepository formationRepository) {
        this.formationRepository = formationRepository;
    }
    public Formation create (Formation formation) {
        return this.formationRepository.save(formation);
    }
    
    public List<Formation> findAll() {
        return this.formationRepository.findAll();
    }
    public Formation findById(long id) {
        return this.formationRepository.findById(id).orElse(null);
    }
    
    /*
    public List<Formation> findAllByFormer(long id) {

        return this.formationRepository.findAllByIdFormer(id);
    }
    
    public List<Formation> findAllByInscription(long id) {
        return this.formationRepository.findAllByIdInscription(id);
    }
    */

    public void delete(long id) {
        this.formationRepository.deleteById(id);
    }
    
    public Formation update (Formation formation) {
        return this.formationRepository.save(formation);
    }
}
