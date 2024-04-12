package com.demo.ViNaStack.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;

import java.util.List;
import java.util.ArrayList;

@Entity
public class Clinic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String symptom;
    @ManyToMany
    @JoinTable(name = "doctor_clinic", joinColumns = @JoinColumn(name = "doctor_id"), inverseJoinColumns = @JoinColumn(name = "clinic_id"))
    private List<Doctor> doctors = new ArrayList<>();

    public Clinic() {
    }

    public Clinic(String name, String symptom) {
        this.name = name;
        this.symptom = symptom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public void addDoctor(Doctor doctor) {
//        doctor.getClinics().add(this);
//        doctors.add(doctor);
//    }

    public List<Doctor> getDoctors() {
        return this.doctors;
    }

}
