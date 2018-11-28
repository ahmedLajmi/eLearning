/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eLearning.eLearning.service;

import com.eLearning.eLearning.model.Payment;
import com.eLearning.eLearning.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author ahlaj
 */

@Service
public class PaymentService {
    
    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }
    
    public Payment findById(long id) {
        return this.paymentRepository.findById(id).orElse(null);
    }
    
    /*
    public List<Payment> findByInscription(long id) {
        return this.paymentRepository.findAllByIdInscription(id);
    }
    */
    
    public Payment create(Payment payment) {
        return this.paymentRepository.save(payment);
    }
    
    public Payment update(Payment payment) {
        return this.paymentRepository.save(payment);
    }
    
    public List<Payment> findAll() {
        return this.paymentRepository.findAll();
    }
    
    public void delete(Long id) {
        this.paymentRepository.deleteById(id);
    }
}
