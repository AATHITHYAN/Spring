package com.learning.repository;

import com.learning.model.Speaker;

import java.util.List;

public interface SpeakerRepository
{
    List<Speaker> findAll();
}
