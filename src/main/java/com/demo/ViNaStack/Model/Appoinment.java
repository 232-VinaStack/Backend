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
    @ElementCollection(targetClass = String.class)
    private List<String> symptoms;
    private int patient_id;

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

    public void setAppointment_time(String appoinment_time) {
        this.appointment_time = appoinment_time;
    }

    public List<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public Appoinment(int id, int doctor_id, String appoinment_time, List<String> symptoms, int patient_id) {
        this.id = id;
        this.doctor_id = doctor_id;
        this.appointment_time = appoinment_time;
        this.symptoms = symptoms;
        this.patient_id = patient_id;
    }
}