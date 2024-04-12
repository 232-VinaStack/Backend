package com.demo.ViNaStack.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class WorkTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String state;
    public String startTime;

    @ManyToMany
    @JoinTable(name = "worktime_doctor", joinColumns = @JoinColumn(name = "worktime_id"), inverseJoinColumns = @JoinColumn(name = "doctor_id"))
    private List<Doctor> doctors;

    public WorkTime() {
    }

    public Long getId() {
        return id;
    }

    public String getState() {
        return state;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setState(String state) {
        this.state = state;
    }
}