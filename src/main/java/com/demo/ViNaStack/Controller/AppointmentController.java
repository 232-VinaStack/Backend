package com.demo.ViNaStack.Controller;



import com.demo.ViNaStack.Model.Appointment;
import com.demo.ViNaStack.Repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "")
public class AppointmentController {
    @Autowired
    private AppointmentRepository repossitory;

    @GetMapping("/appointments")
    List<Appointment> getAppointment() {
        return repossitory.findAll();
    }

    @RequestMapping(value = "/appointments/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteAppointment(@PathVariable("id") long id) {
        try {
            repossitory.deleteById(id);
            return ResponseEntity.ok("Appointment deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to delete appointment");
        }
    }

    @RequestMapping(value = "/appointments/{id}", method = RequestMethod.POST)
    public ResponseEntity<String> addAppointment(@RequestBody Appointment appointment) {

        try {
            repossitory.save(appointment);
            return ResponseEntity.ok("Appointment added successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to add appointment");
        }
    }
}
