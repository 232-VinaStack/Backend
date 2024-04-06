package com.demo.ViNaStack.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int doctor_id;
    private String start_time;
    private String end_time;
    @ManyToMany
    @JoinTable(name = "appointment_symptoms",
            joinColumns = @JoinColumn(name = "appointment_id"),
            inverseJoinColumns = @JoinColumn(name = "symptom_id"))
    private List<Symptom> symptoms;
    private int patient_id;
    
    public Appointment(int doctor_id, String start_time, String end_time, List<Symptom> symptoms, int patient_id) {
        this.doctor_id = doctor_id;
        this.start_time = start_time;
        this.end_time = end_time;
        this.symptoms = symptoms;
        this.patient_id = patient_id;
    }
    
    public Appointment() {
    
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getDoctor_id() {
        return doctor_id;
    }
    
    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }
    
    public String getStart_time() {
        return start_time;
    }
    
    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }
    
    public String getEnd_time() {
        return end_time;
    }
    
    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }
    
    public List<Symptom> getSymptoms() {
        return symptoms;
    }
    
    public void setSymptoms(List<Symptom> symptoms) {
        this.symptoms = symptoms;
    }
    
    public int getPatient_id() {
        return patient_id;
    }
    
    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }
}