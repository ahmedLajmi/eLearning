package com.eLearning.eLearning.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;


@Entity
public class Inscription {
    @Id
    @GeneratedValue
    private long id;
    
    private Date inscriptionDate;
    
    @ManyToOne
    @JoinColumn(name="candidate_id")
    private Candidate candidate;


    @ManyToOne
    @JoinColumn(name="formation_id")
    private Formation formation;


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    public Inscription(long id, Date inscriptionDate, Candidate condidate , Formation formation) {
        this.id = id;
        this.inscriptionDate = inscriptionDate;
        this.candidate = condidate;
        this.formation = formation;
    }

    public Inscription() {
        // empty constructor
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setInscriptionDate(Date inscriptionDate) {
        this.inscriptionDate = inscriptionDate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public long getId() {
        return id;
    }

    public Date getInscriptionDate() {
        return inscriptionDate;
    }

    public Candidate getCandidate() {
        return candidate;
    }


    public Formation getFormation() {
        return formation;
    }

    
    
}
