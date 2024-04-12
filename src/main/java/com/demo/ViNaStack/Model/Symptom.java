package com.demo.ViNaStack.Model;

import jakarta.persistence.*;

// import java.util.ArrayList;
// import java.util.List;

@Entity
public class Symptom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Symptom() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symptom(String name, Long id) {
        this.name = name;
        this.id = id;
    }
}