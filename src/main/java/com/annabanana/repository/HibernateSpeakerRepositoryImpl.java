package com.annabanana.repository;

import com.annabanana.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Anna");
        speaker.setLastName("Banana");

        speakers.add(speaker);

        return speakers;
    }
}
