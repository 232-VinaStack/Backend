package com.demo.ViNaStack.Model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Appoinment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int doctor_id;
    private String appointment_time;
    @ManyToMany(cascade = CascadeType.PERSIST) // For persisting symptoms automatically
    @JoinTable(name = "appointment_symptoms", // Define join table name
            joinColumns = @JoinColumn(name = "appointment_id"),
            inverseJoinColumns = @JoinColumn(name = "symptom_id"))
    private List<Symptom> symptoms;
    private int patient_id;
    
    public Appoinment(int id, int doctor_id, String appointment_time, List<Symptom> symptoms, int patient_id) {
        this.id = id;
        this.doctor_id = doctor_id;
        this.appointment_time = appointment_time;
        this.symptoms = symptoms;
        this.patient_id = patient_id;
    }
    
    public Appoinment() {
    
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
    
    public String getAppointment_time() {
        return appointment_time;
    }
    
    public void setAppointment_time(String appointment_time) {
        this.appointment_time = appointment_time;
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