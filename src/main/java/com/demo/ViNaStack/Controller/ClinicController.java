package com.demo.ViNaStack.Controller;

import com.demo.ViNaStack.Model.Clinic;
import com.demo.ViNaStack.Repositories.ClinicRepossitories;
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
@RequestMapping(path = "/clinic")
public class ClinicCtroller {

    @Autowired
    private ClinicRepossitories repository;

    @GetMapping("")
    List<Clinic> getClinics() {
        return repository.findAll();
    }

    @PostMapping("/create")
    public void createClinics(@RequestParam String name,
            @RequestParam String symptom) {
        repository.save(new Clinic(name, symptom));
    }

}
