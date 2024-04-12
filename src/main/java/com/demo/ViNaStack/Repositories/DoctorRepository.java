package com.demo.ViNaStack.Repositories;

import com.demo.ViNaStack.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    List<Doctor> findByClinicsSymptomContaining(String symptom);
}
