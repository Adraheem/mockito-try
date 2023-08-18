package com.example.kindergarten.services.impl;

import com.example.kindergarten.data.models.Classroom;
import com.example.kindergarten.data.repositories.ClassroomRepository;
import com.example.kindergarten.dto.CreateClassroomDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
class ClassroomServiceImplTest {

    @Autowired
    private ClassroomServiceImpl classroomService;

    @MockBean
    private ClassroomRepository classroomRepository;

    @Test
    void createClassroom() {
        // given that I have a new classroom to create
        CreateClassroomDto requestDto = CreateClassroomDto.builder()
                .name("KG1")
                .build();

        when(classroomRepository.save(any()))
                .thenReturn(
                        Classroom.builder()
                                .id(1L)
                                .name("KG1")
                                .build()
                );

        // when I create the classroom
        Classroom classroom = classroomService.createClassroom(requestDto);

        // Assert that the classroom is created with the correct details
        assertNotNull(classroom);
        assertNotNull(classroom.getId());
        assertEquals(classroom.getName(), "KG1");
    }

    @Test
    void updateClassroom() {
    }

    @Test
    void getClassroom() {
    }

    @Test
    void deleteClassroom() {
    }
}