package com.example.kindergarten.services;

import com.example.kindergarten.data.models.Classroom;
import com.example.kindergarten.dto.CreateClassroomDto;
import com.example.kindergarten.dto.UpdateClassroomDto;

public interface ClassroomService {

    Classroom createClassroom(CreateClassroomDto requestDto);

    Classroom updateClassroom(UpdateClassroomDto requestDto);

    Classroom getClassroom(Long id);

    void deleteClassroom(Long id);

}
