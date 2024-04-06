package com.demo.ViNaStack.Repositories;

import com.demo.ViNaStack.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepossitories extends JpaRepository<Doctor, Long> {
}
