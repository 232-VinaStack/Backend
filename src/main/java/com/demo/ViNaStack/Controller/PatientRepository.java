package com.demo.ViNaStack.Repositories;

import com.demo.ViNaStack.Model.Patient;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PatientRepository extends CrudRepository<Patient, Integer> {
  Optional<Patient> findById(Integer patientId);
  Optional<Patient> findByFirstName(String firstName);
}
