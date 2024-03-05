package com.isi.hopitalapp.entities;

import javax.persistence.*;
import java.util.List;

@Entity

public class Specialite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;


    @OneToMany(mappedBy = "specialite_id")
    private List<Medcin> medcins;

    public Specialite() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Medcin> getMedcins() {
        return medcins;
    }

    public void setMedcins(List<Medcin> medcins) {
        this.medcins = medcins;
    }
}
