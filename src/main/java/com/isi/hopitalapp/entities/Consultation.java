package com.isi.hopitalapp.entities;

import javax.persistence.*;

@Entity
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "medcin_id")
    private Medcin medcin_id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Medcin getMedcin_id() {
        return medcin_id;
    }

    public void setMedcin_id(Medcin medcin_id) {
        this.medcin_id = medcin_id;
    }

    public Patient getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Patient patient_id) {
        this.patient_id = patient_id;
    }
}
