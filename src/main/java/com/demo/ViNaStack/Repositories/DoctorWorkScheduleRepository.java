package com.demo.ViNaStack.Repositories;

import com.demo.ViNaStack.Enum.Status;
import com.demo.ViNaStack.Model.DoctorWorkSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DoctorWorkScheduleRepository extends JpaRepository<DoctorWorkSchedule, Integer> {
    @Query("SELECT dws.workSchedule.id FROM DoctorWorkSchedule dws WHERE dws.doctor.id = :doctor_id AND dws.status = :status")
    List<Integer> findScheduleIdsByDoctorIdAndStatus(@Param("doctor_id") Long doctor_id, @Param("status") Status status);
}
