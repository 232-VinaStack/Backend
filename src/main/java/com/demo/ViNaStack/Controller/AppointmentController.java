package com.demo.ViNaStack.Controller;

import com.demo.ViNaStack.Model.*;

import com.demo.ViNaStack.Repositories.*;

import com.demo.ViNaStack.Model.Appointment;
import com.demo.ViNaStack.Model.Doctor;
import com.demo.ViNaStack.Model.Symptom;
import com.demo.ViNaStack.Repositories.*;
import com.demo.ViNaStack.Repositories.SymptomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "")
public class AppointmentController {
    @Autowired
    private AppointmentRepository repository;

    @Autowired
    private SymptomRepository symptomRepository;

    @GetMapping("/appointments")
    List<Appointment> getAppointment() {
        return repository.findAll();
    }

    @RequestMapping(value = "/appointments/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteAppointment(@PathVariable("id") long id) {
        try {
            repository.deleteById(id);
            return ResponseEntity.ok("Appointment deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to delete appointment");
        }
    }

    @PostMapping("/appointments/create")
    public ResponseEntity<String> createAppointment(@RequestBody Appointment appointment) {
        try {
            List<Symptom> symptoms = appointment.getSymptoms();
            symptomRepository.saveAll(symptoms);
            appointment.setSymptoms(symptoms);
            repository.save(appointment);

            return ResponseEntity.ok("Appointment created successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to add appointment");
        }
    }
}
