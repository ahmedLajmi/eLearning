package com.eLearning.eLearning.model;

import javax.persistence.*;
import java.util.Objects;


@Entity
public class Payment {

    @Id
    @GeneratedValue
    private long id;
    
    private float amount;
    
    @ManyToOne
    @JoinColumn(name="inscription_id")
    private Inscription inscription;

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    public Payment(long idPayments, float amount, Inscription inscription) {
        this.id = id;
        this.amount = amount;
        this.inscription = inscription;
    }

    public Payment() {
        // empty constructor
    }

    public void setId(long idPayments) {
        this.id = id;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setInscription(Inscription inscription) {
        this.inscription = inscription;
    }

    public long getId() {
        return id;
    }

    public float getAmount() {
        return amount;
    }

    public Inscription getInscription() {
        return inscription;
    }

}
