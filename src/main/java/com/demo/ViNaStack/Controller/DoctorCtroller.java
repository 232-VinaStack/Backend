package com.demo.ViNaStack.Controller;

import com.demo.ViNaStack.Model.Doctor;
import com.demo.ViNaStack.Repositories.DoctorRepossitories;
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

@RestController
@RequestMapping(path = "/doctor")
public class DoctorCtroller {

    @Autowired
    private DoctorRepossitories repository;

    @GetMapping("")
    List<Doctor> getDoctors() {
        return repository.findAll();
    }

    @PostMapping("/create")
    public void createDoctors(@RequestParam String name) {
        repository.save(new Doctor(name));
    }

}
