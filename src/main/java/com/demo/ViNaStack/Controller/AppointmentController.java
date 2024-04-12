package com.demo.ViNaStack.Controller;

import com.demo.ViNaStack.Model.*;

import com.demo.ViNaStack.Repositories.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/appointment")
public class AppointmentController {
    @Autowired
    private AppointmentRepository repository;
    private WorkTimeRepository workTimeRepository;

    @Autowired
    private SymptomRepository symptomRepository;

    @GetMapping("")
    List<Appointment> getAppointments() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAppointmentById(@RequestParam Long id) {
        try {
            Appointment appointment = repository.findById(id).orElse(null);
            if (appointment != null) {
                return ResponseEntity.ok().body(appointment);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to retrieve appointment");
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteAppointment(@PathVariable("id") Long id) {
        try {
            repository.deleteById(id);
            return ResponseEntity.ok("Appointment deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to delete appointment");
        }
    }

    @PostMapping("/create")
    public ResponseEntity<String> createAppointment(@RequestBody Appointment appointment) {
        try {
            List<Symptom> symptoms = appointment.getSymptoms();
            symptomRepository.saveAll(symptoms);
            appointment.setSymptoms(symptoms);
            repository.save(appointment);

            // ! update WorkTime state
            WorkTime workTime = workTimeRepository.findByStartTime(appointment.getStart_time());
            workTime.setState("Busy");
            return ResponseEntity.ok("Appointment created successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to create appointment" + e);
        }
    }
}
