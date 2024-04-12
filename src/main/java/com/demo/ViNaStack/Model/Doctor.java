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

    private String name;
    private String avatarLink;
    private Integer expYear;
    private String education;
//    @ManyToMany(mappedBy = "doctors")
//    private List<Clinic> clinics = new ArrayList<>();

    public Doctor(String name, String avatarLink, Integer expYear, String education) {
        this.name = name;
        this.avatarLink = avatarLink;
        this.expYear = expYear;
        this.education = education;
    }

    public Doctor() {
    }

    public Doctor(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAvatarLink(String avatarLink) {
        this.avatarLink = avatarLink;
    }

    public void setExpYear(Integer expYear) {
        this.expYear = expYear;
    }

    public void setEducation(String education) {
        this.education = education;
    }

//    public void setClinics(List<Clinic> clinics) {
//        this.clinics = clinics;
//    }

    public Integer getExpYear() {
        return expYear;
    }

    public String getAvatarLink() {
        return avatarLink;
    }

    public Long getId() {
        return id;
    }

    public String getEducation() {
        return education;
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


//    public List<Clinic> getClinics() {
//        return this.clinics;
//    }
}
