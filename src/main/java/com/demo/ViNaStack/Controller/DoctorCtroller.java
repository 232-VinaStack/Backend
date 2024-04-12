package com.demo.ViNaStack.Controller;

import com.demo.ViNaStack.Enum.Status;
import com.demo.ViNaStack.Model.Doctor;
import com.demo.ViNaStack.Model.DoctorWorkSchedule;
import com.demo.ViNaStack.Model.WorkSchedule;
import com.demo.ViNaStack.Repositories.DoctorRepossitories;
import com.demo.ViNaStack.Repositories.DoctorWorkScheduleRepository;
import com.demo.ViNaStack.Repositories.WorkScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping(path = "/doctor")
public class DoctorCtroller {

    @Autowired
    private DoctorRepossitories repository;

    @Autowired
    private WorkScheduleRepository workScheduleRepository;

    @Autowired
    private DoctorWorkScheduleRepository doctorWorkScheduleRepository;

    @GetMapping("")
    List<Doctor> getDoctors() {
        return repository.findAll();
    }

    @PostMapping("/create")
    public void createDoctors(@RequestParam String name) {
        repository.save(new Doctor(name));
    }

    @GetMapping("{id}/schedules")
    public List<WorkSchedule> getWorkSchedules(@PathVariable Long id) {
        List<Integer> scheduleIds = doctorWorkScheduleRepository.findScheduleIdsByDoctorIdAndStatus(id, Status.FREE);
        return scheduleIds.stream()
                .map(workScheduleRepository::findById)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }
}
