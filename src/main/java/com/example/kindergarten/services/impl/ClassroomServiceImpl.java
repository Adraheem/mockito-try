package com.example.kindergarten.services.impl;

import com.example.kindergarten.data.models.Classroom;
import com.example.kindergarten.data.repositories.ClassroomRepository;
import com.example.kindergarten.dto.CreateClassroomDto;
import com.example.kindergarten.dto.UpdateClassroomDto;
import com.example.kindergarten.services.ClassroomService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClassroomServiceImpl implements ClassroomService {

    private final ClassroomRepository repository;

    @Override
    public Classroom createClassroom(CreateClassroomDto requestDto) {
        Classroom classroom =Classroom.builder()
                .name(requestDto.getName())
                .build();
        return repository.save(classroom);
    }

    @Override
    public Classroom updateClassroom(UpdateClassroomDto requestDto) {
        return null;
    }

    @Override
    public Classroom getClassroom(Long id) {
        return null;
    }

    @Override
    public void deleteClassroom(Long id) {

    }
}
