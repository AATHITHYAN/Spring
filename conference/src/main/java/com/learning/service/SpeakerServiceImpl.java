package com.learning.service;

import com.learning.model.Speaker;
import com.learning.repository.HibernateSpeakerRepository;
import com.learning.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository respository = new HibernateSpeakerRepository();

    @Override
    public List<Speaker> findAll()
    {
        return respository.findAll();
    }
}
