package fr.devoxx.service;

import fr.devoxx.dao.SpeakerObjectMapper;
import fr.devoxx.dto.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeakerService {


    @Autowired
    private SpeakerObjectMapper speakerObjectMapper;

    public List<Speaker> getSpeakers() {

        return speakerObjectMapper.getSpeakers();
    }


    public Speaker getSpeaker(Long id) {

        return speakerObjectMapper.getSpeakers(id);
    }

    public Speaker updateSpeaker(Long id, Speaker speaker) {
        speaker.setId(id);
        speakerObjectMapper.update(speaker);
        return getSpeaker(id);
    }

}