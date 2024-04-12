package com.demo.ViNaStack.Repositories;

import com.demo.ViNaStack.Model.WorkTime;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface WorkTimeRepository extends JpaRepository<WorkTime, Long> {
    WorkTime findByStartTime(String startTime);
}
