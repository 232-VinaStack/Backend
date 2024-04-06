package com.demo.ViNaStack.Model;

import jakarta.persistence.*;

@Entity
@Table(name="patient")
public class Patient {
  @Id
  @Column(name="patient_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int patientId;

  @Column(name="first_name")
  private String firstName;

  @Column(name="last_name")
  private String lastName;

  @Column(name="email")
  private String email;

  public Patient() {
  }

  @Column(name="phone_number")
  private String phoneNumber;

  public Patient(int patientId, String firstName, String lastName, String email, String phoneNumber) {
    this.patientId = patientId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  public Patient(String firstName, String lastName, String email, String phoneNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  public int getPatientId() {
    return patientId;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmail() {
    return email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPatientId(int patientId) {
    this.patientId = patientId;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}
