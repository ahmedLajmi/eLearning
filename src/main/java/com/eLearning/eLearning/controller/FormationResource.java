package com.eLearning.eLearning.controller;

import com.eLearning.eLearning.model.Formation;
import com.eLearning.eLearning.service.FormationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formations")
public class FormationResource {
    private final FormationService formationService;

    public FormationResource(FormationService formationService) {
        this.formationService = formationService;
    }
       
    @GetMapping
    public List<Formation> findAll() {
        return this.formationService.findAll();
    }

    /*
    @GetMapping("/formers/{id}")
    public List<Formation> findAllByFormer(@PathVariable Long id) {
        return this.formationService.findAllByFormer(id);
    }
    
    @GetMapping("/insciptions/{id}")
    public List<Formation> findAllByInscription(@PathVariable Long id) {
        return this.formationService.findAllByInscription(id);
    }
    */

    @GetMapping("/{id}")
    public Formation findById(@PathVariable Long id) {
        return this.formationService.findById(id);
    }
    
    @PostMapping
    public Formation create(@PathVariable Formation formation) {
        return this.formationService.create(formation);
    }
    @PutMapping
    public Formation update(@PathVariable Formation formation) {
        return this.formationService.update(formation);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.formationService.delete(id);
    }
}
