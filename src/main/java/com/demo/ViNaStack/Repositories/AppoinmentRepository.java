package com.demo.ViNaStack.Repositories;

import com.demo.ViNaStack.Model.Appoinment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppoinmentRepository extends JpaRepository<Appoinment, Long> {
}
