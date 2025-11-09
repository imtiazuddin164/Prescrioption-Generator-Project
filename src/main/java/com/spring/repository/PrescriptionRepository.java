package com.spring.repository;

import com.spring.model.Prescription;
import com.spring.model.User;
import com.spring.dto.DailyCount;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.time.LocalDate;
import java.util.List;

public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {
    @Query("SELECT p FROM Prescription p WHERE p.prescriptionDate BETWEEN :from AND :to")
    List<Prescription> findByDateRange(@Param("from") LocalDate from, @Param("to") LocalDate to);

    @Query("SELECT new com.spring.dto.DailyCount(p.prescriptionDate, COUNT(p)) " +
           "FROM Prescription p GROUP BY p.prescriptionDate ORDER BY p.prescriptionDate")
    List<DailyCount> countByDay();

    
    List<Prescription> findByUserAndPrescriptionDateBetween(User user, LocalDate start, LocalDate end);
}
