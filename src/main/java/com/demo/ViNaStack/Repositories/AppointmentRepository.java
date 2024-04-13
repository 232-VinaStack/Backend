package com.demo.ViNaStack.Repositories;

import com.demo.ViNaStack.Model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
