package com.learning.repository;

import com.learning.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepository implements SpeakerRepository {
    @Override
    public List<Speaker> findAll()
    {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Aathithyan");
        speaker.setLastName("Kaliyamoorthy");

        speakers.add(speaker);

        return speakers;
    }
}
