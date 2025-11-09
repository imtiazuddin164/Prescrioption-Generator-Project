package com.spring.service;

import com.spring.model.Prescription;
import com.spring.dto.DailyCount;
import com.spring.repository.PrescriptionRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PrescriptionService {
    private final PrescriptionRepository repo;
    public PrescriptionService(PrescriptionRepository repo) { this.repo = repo; }

    public List<Prescription> list(LocalDate from, LocalDate to) {
        return repo.findByDateRange(from, to);
    }

    public Prescription save(Prescription p) { return repo.save(p); }
    public Optional<Prescription> find(Long id) { return repo.findById(id); }
    public void delete(Long id) { repo.deleteById(id); }
    public List<DailyCount> dayWise() { return repo.countByDay(); }
}
