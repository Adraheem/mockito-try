package com.example.kindergarten.services.impl;

import com.example.kindergarten.data.repositories.PupilRepository;
import com.example.kindergarten.services.PupilService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PupilServiceImpl implements PupilService {

    private final PupilRepository repository;

}
