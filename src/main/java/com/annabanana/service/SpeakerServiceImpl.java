package com.annabanana.service;

import com.annabanana.model.Speaker;
import com.annabanana.repository.HibernateSpeakerRepositoryImpl;
import com.annabanana.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
