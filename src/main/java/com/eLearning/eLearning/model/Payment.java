package com.eLearning.eLearning.model;

import javax.persistence.*;
import java.util.Objects;


@Entity
public class Payment {

    @Id
    @GeneratedValue
    private long idPayments;
    
    private float amount;
    
    @ManyToOne
    @JoinColumn(name="idInscription")
    private Inscription inscription;

    @Override
    public int hashCode() {
        return Objects.hash(idPayments);
    }
    public Payment(long idPayments, float amount, Inscription inscription) {
        this.idPayments = idPayments;
        this.amount = amount;
        this.inscription = inscription;
    }

    public Payment() {
        // empty constructor
    }

    public void setIdPayments(long idPayments) {
        this.idPayments = idPayments;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setInscription(Inscription inscription) {
        this.inscription = inscription;
    }

    public long getIdPayments() {
        return idPayments;
    }

    public float getAmount() {
        return amount;
    }

    public Inscription getInscription() {
        return inscription;
    }

}
