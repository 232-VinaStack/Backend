package com.demo.ViNaStack.Controller;

import com.demo.ViNaStack.Model.Doctor;
import com.demo.ViNaStack.Repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.ViNaStack.Model.Appointment;
import com.demo.ViNaStack.Model.Doctor;
import com.demo.ViNaStack.Model.Symptom;
import com.demo.ViNaStack.Repositories.AppointmentRepository;
import com.demo.ViNaStack.Repositories.SymptomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/doctor")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    @GetMapping("")
    List<Doctor> getDoctors() {
        return repository.findAll();
    }

    @GetMapping("/id")
    public ResponseEntity<?> getDoctorById(@RequestParam Long id) {
        try {
            Doctor doctor = repository.findById(id).orElse(null);
            if (doctor != null) {
                return ResponseEntity.ok().body(doctor);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to retrieve doctor");
        }
    }

    @GetMapping("/symptom")
    public ResponseEntity<?> getDoctorBySymptom(@RequestParam String symptom) {
        try {
            Doctor doctor = repository.findByClinicsSymptomContaining(symptom).get(0);
            if (doctor != null) {
                return ResponseEntity.ok().body(doctor);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to retrieve doctor");
        }
    }
}
