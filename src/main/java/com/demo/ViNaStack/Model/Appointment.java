package com.demo.ViNaStack.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String user_name;
    private String user_phone;
    private String clinic;
    String workday;

    @ManyToOne
    @JoinTable(name = "Appointment_Doctor", // Define join table name
            joinColumns = @JoinColumn(name = "Appointment_id"), inverseJoinColumns = @JoinColumn(name = "Doctor_id"))
    private Doctor doctor_id;

    @OneToMany(cascade = CascadeType.PERSIST) // For persisting symptoms automatically
    @JoinTable(name = "Appointment_Symptom", // Define join table name
            joinColumns = @JoinColumn(name = "Appointment_id"), inverseJoinColumns = @JoinColumn(name = "Symptom_id"))
    private List<Symptom> symptoms;

    public Long getId() {
        return id;
    }

    public Appointment() {

    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public String getClinic() {
        return clinic;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }

    public void setDoctor_id(Doctor doctor_id) {
        this.doctor_id = doctor_id;
    }

    public void setSymptoms(List<Symptom> symptoms) {
        this.symptoms = symptoms;
    }

    public Doctor getDoctor_id() {
        return doctor_id;
    }

    public List<Symptom> getSymptoms() {
        return symptoms;
    }

    public Appointment(String user_name, String user_phone, String clinic, Doctor doctor_id,
            List<Symptom> symptoms) {

        this.user_name = user_name;
        this.user_phone = user_phone;
        this.clinic = clinic;
        this.doctor_id = doctor_id;
        this.symptoms = symptoms;
    }

}