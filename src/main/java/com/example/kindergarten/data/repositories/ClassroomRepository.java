package com.example.kindergarten.data.repositories;

import com.example.kindergarten.data.models.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
}
