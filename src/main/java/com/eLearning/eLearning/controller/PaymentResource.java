/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eLearning.eLearning.controller;

import com.eLearning.eLearning.model.Payment;
import com.eLearning.eLearning.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author ahlaj
 */

@RestController
@RequestMapping("/payments")
public class PaymentResource {
    
    private final PaymentService paymentService;

    public PaymentResource(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    
    @GetMapping
    public List<Payment> findAll() {
        return this.paymentService.findAll();
    }

    /*
    @GetMapping("/inscription/{id}")
    public List<Payment> findAllByInscription(@PathVariable Long id) {
        return this.paymentService.findByInscription(id);
    }
    */

    @GetMapping("/{id}")
    public Payment findById(@PathVariable Long id) {
        return this.paymentService.findById(id);
    }
    
    @PostMapping
    public Payment create(@PathVariable Payment payment) {
        return this.paymentService.create(payment);
    }
    
    @PutMapping
    public Payment update(@PathVariable Payment payment) {
        return this.paymentService.update(payment);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.paymentService.delete(id);
    }

}
