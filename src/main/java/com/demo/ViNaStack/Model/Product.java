package com.demo.ViNaStack.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    private int name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public Product(){}
    public Product(int name) {
        this.name = name;
    }

    public int getName() {
        return name;
    }

    @Override
    public String toString() {return "PROduct" + name;}
}
