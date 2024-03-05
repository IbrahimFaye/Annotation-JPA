package com.isi.hopitalapp.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Patient extends  Personne {
    @Column(name = "numDossier")
    private String numDossier;
    @Column(name = "telephone")
    private String telephone;
    @OneToMany(mappedBy = "patient_id")
    private List<Consultation> consultations;

    public Patient() {
    }

    public String getNumDossier() {
        return numDossier;
    }

    public void setNumDossier(String numDossier) {
        this.numDossier = numDossier;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
