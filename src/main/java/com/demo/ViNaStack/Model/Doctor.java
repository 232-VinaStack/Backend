package com.demo.ViNaStack.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;

import java.util.List;
import java.util.ArrayList;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    @ManyToMany(mappedBy = "doctors")
    private List<Clinic> clinics = new ArrayList<>();

    public Doctor() {
    }

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addClinic(Clinic clinic) {
        this.clinics.add(clinic);
        clinic.getDoctors().add(this);
    }

    public List<Clinic> getClinics() {
        return this.clinics;
    }
}
