package com.eLearning.eLearning.controller;

import com.eLearning.eLearning.model.Former;
import com.eLearning.eLearning.service.FormerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formers")
public class FormerResource {
    private final FormerService formerService;

    public FormerResource(FormerService formerService) {
        this.formerService = formerService;
    }
    @GetMapping
    public List<Former> findAll() {
        return this.formerService.findAll();
    }
    @GetMapping("/{id}")
    public Former findById(@PathVariable int id) {
        return this.formerService.findById(id);
    }

    /*
    @GetMapping("/formations/{id}")
    public List<Former> findAllByFormation(@PathVariable Long id) {
        return this.formerService.findAllByFormation(id);
    }
    */
    @PostMapping
    public Former create(@PathVariable Former former) {
        return this.formerService.create(former);
    }
    @PutMapping
    public Former update(@PathVariable Former former) {
        return this.formerService.update(former);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.formerService.delete(id);
    }
}
