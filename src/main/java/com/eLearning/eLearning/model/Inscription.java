package com.eLearning.eLearning.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;


@Entity
public class Inscription {
    @Id
    @GeneratedValue
    private long idInscription;
    
    private Date inscriptionDate;
    
    @ManyToOne
    @JoinColumn(name="idCondidate")
    private Candidate condidate;


    @ManyToOne
    @JoinColumn(name="idFormation")
    private Formation formation;


    @Override
    public int hashCode() {
        return Objects.hash(idInscription);
    }
    
    public Inscription(long idInscription, Date inscriptionDate, Candidate condidate /*, Formation formation*/) {
        this.idInscription = idInscription;
        this.inscriptionDate = inscriptionDate;
        this.condidate = condidate;
        //this.formation = formation;
    }

    public Inscription() {
        // empty constructor
    }

    public void setIdInscription(long idInscription) {
        this.idInscription = idInscription;
    }

    public void setInscriptionDate(Date inscriptionDate) {
        this.inscriptionDate = inscriptionDate;
    }

    public void setCondidate(Candidate condidate) {
        this.condidate = condidate;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public long getIdInscription() {
        return idInscription;
    }

    public Date getInscriptionDate() {
        return inscriptionDate;
    }

    public Candidate getCondidate() {
        return condidate;
    }


    public Formation getFormation() {
        return formation;
    }

    
    
}
