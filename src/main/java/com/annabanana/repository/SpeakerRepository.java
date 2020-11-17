package com.annabanana.repository;

import com.annabanana.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
