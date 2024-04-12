package com.demo.ViNaStack.Controller;

import com.demo.ViNaStack.Model.Patient;
import com.demo.ViNaStack.Repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/patient")
public class PatientController {
  @Autowired
  private PatientRepository patientRepository;

  @GetMapping("/all")
  @ResponseBody
  public List<Patient> findAllPatient() {
    return (List<Patient>) patientRepository.findAll();
  }

  @GetMapping("/{id}")
  @ResponseBody
  public Patient findPatientById(@PathVariable(name = "id") Integer patientId) {
    Patient savedPatient = patientRepository.findById(patientId).get();
    return savedPatient;
  }

  @PostMapping("/new-patient")
  public ResponseEntity<String> savePatient(@RequestBody Patient newPatient) {
    try {
      Patient savedPatient = this.patientRepository.save(newPatient);
      return ResponseEntity.ok("Patient created successfully");
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Server error");
    }
  }
}
