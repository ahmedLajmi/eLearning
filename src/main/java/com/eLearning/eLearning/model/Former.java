package com.eLearning.eLearning.model;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "former")
public class Former {
   @Id
   @GeneratedValue
   private long id;
   
   @Column(name = "first_name")
   private String firstName;
   
   @Column(name = "last_name")
   private String lastName;
   
   @Column(name = "telephone")
   private long telephone;
   
   @Email
   @Column(name = "email")
   private String email;
   
   @ManyToMany
   @JoinTable(joinColumns = @JoinColumn(name = "idFormer"), inverseJoinColumns = @JoinColumn(name = "idFormation") )
    private List<Formation> formations = new ArrayList<>();

    public Former() {
        // Empty constructor
    }

    public Former(long id, String firstName, String lastName, long telephone, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        this.email = email;
    }

   @Override
    public int hashCode() {
        return Objects.hash(lastName);
    }
   @Override
    public String toString() {
        return "Former{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Former former = (Former) o;
        return Objects.equals(firstName, former.firstName) &&
                Objects.equals(lastName, former.lastName) &&
                Objects.equals(email, former.email) &&
                Objects.equals(telephone, former.telephone);
    }
    public long getId() {
        return id;
    }

    public String getfirstName() {
        return firstName;
    }

    public String getName() {
        return lastName;
    }

    public long getPhone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public List<Formation> getFormations() {
        return formations;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(long telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFormations(List<Formation> formations) {
        this.formations = formations;
    }
   
   
}
