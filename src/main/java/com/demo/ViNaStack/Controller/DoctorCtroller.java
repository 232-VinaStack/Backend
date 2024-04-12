package com.demo.ViNaStack.Controller;

import com.demo.ViNaStack.Model.Appointment;
import com.demo.ViNaStack.Model.Doctor;
import com.demo.ViNaStack.Repositories.DoctorRepossitories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping(path = "/doctor")
public class DoctorCtroller {

    @Autowired
    private DoctorRepossitories repository;

    @GetMapping("")
    List<Doctor> getDoctors() {
        return repository.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<String> addDoctor(@RequestBody Doctor doctor) {

        try {
//            repository.save(doctor);
            return ResponseEntity.ok("Doctor added successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to add Doctor");
        }
    }

}
