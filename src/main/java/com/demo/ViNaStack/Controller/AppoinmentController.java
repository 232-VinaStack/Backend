package com.demo.ViNaStack.Controller;



import com.demo.ViNaStack.Model.Appoinment;
import com.demo.ViNaStack.Repositories.AppoinmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/api")
public class AppoinmentController {
    @Autowired
    private AppoinmentRepository repossitory;

    @GetMapping("/appointments")
    List<Appoinment> getAppoinment() {
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

    @RequestMapping(value = "/appointments", method = RequestMethod.POST)
    public ResponseEntity<Appoinment> addAppointment(@RequestBody Appoinment appointment) {
        try {
            repossitory.save(appointment);
            return ResponseEntity.ok(null);
        } catch (Exception e) {
            // ... Error handling ...
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(appointment);
        }
    }
}
