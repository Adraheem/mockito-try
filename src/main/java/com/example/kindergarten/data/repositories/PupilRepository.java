package com.example.kindergarten.data.repositories;

import com.example.kindergarten.data.models.Pupil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PupilRepository extends JpaRepository<Pupil, Long> {
}
