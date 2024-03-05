package com.isi.hopitalapp.entities;
import javax.persistence.*;
import java.util.List;

@Entity
public class Medcin extends Personne {
    @Column(name = "grade")
    private String grade;
    @Column(name = "salaire")
    private double salaire;
    @ManyToOne
    @JoinColumn(name = "specialite_id")
    private Specialite specialite_id;
    @OneToMany(mappedBy = "medcin_id")
    private List<Consultation> consultations;

    public Medcin() {
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public double getSalaire() {
        return salaire;
    }
    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}
