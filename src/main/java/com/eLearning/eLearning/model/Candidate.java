package com.eLearning.eLearning.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Entity
public class Candidate {
   @Id
   @GeneratedValue
   private long idCondidate;
   
   private String familyName;
   private String name;
   private long phone;
   private String email;


   @OneToMany(mappedBy ="condidate")
    private List<Inscription> inscriptions = new ArrayList<>();

   @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    public Candidate(long idCondidate, String familyName, String name, long phone, String email) {
        this.idCondidate = idCondidate;
        this.familyName = familyName;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public Candidate() {
        // empty constructor
    }

    public void setIdCondidate(long idCondidate) {
        this.idCondidate = idCondidate;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*
    public void setInscriptions(List<Inscription> inscriptions) {
        this.inscriptions = inscriptions;
    }
    */

    public long getIdCondidate() {
        return idCondidate;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getName() {
        return name;
    }

    public long getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    /*
    public List<Inscription> getInscriptions() {
        return inscriptions;
    }
    */
   
   
}
