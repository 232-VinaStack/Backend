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
    @ManyToMany(mappedBy = "doctors")
    private List<WorkTime> worktimes = new ArrayList<>();

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

    public List<WorkTime> getWorktimes() {
        return worktimes;
    }

}
