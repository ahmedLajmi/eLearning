package com.eLearning.eLearning.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;


@Entity
public class Formation {
    @Id
    @GeneratedValue
    private long id;

    private String name;
    private Date startDate;
    private Date endDate;
    private float price;


    @ManyToMany(mappedBy = "formations")
    private List<Former> formers = new ArrayList<>();

    @OneToMany(mappedBy ="formation")
    private List<Inscription> inscriptions = new ArrayList<>();

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Formation formation = (Formation) o;
        return Objects.equals(name, formation.name) &&
                Objects.equals(price, formation.price) &&
                Objects.equals(startDate, formation.startDate) &&
                Objects.equals(endDate, formation.endDate);
    }

    @Override
    public String toString() {
        return "Formation{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    public Formation(long id, String name, Date startDate, Date endDate, float price) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.name = name;
    }

    public Formation() {
       // Empty constructor
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setFormers(List<Former> formers) {
        this.formers = formers;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setInscriptions(List<Inscription> inscriptions) {
        this.inscriptions = inscriptions;
    }

    public List<Inscription> getInscriptions() {
        return inscriptions;
    }

    public long getId() {
        return id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public float getPrice() {
        return price;
    }

    public List<Former> getFormers() {
        return formers;
    }

    public String getName() {
        return name;
    }

}
