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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String avatar_link;
    public String education;
    public int exp_year;
    private String name;
    @ManyToMany(mappedBy = "doctors")
    private List<Clinic> clinics = new ArrayList<>();

    public Doctor() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Clinic> getClinics() {
        return clinics;
    }

}
