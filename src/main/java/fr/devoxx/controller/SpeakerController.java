package fr.devoxx.controller;

import fr.devoxx.dto.Speaker;
import fr.devoxx.service.SpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class SpeakerController {

    @Autowired
    private SpeakerService speakerService;

    @RequestMapping(value = "/speaker", method = GET)
    public List<Speaker> getSpeakers() {
        return speakerService.getSpeakers();
    }

    @RequestMapping(value = "/speaker/{id}", method = GET)
    public Speaker getSpeaker(@PathVariable("id") Long id) {
        return speakerService.getSpeaker(id);
    }

    @RequestMapping(value = "/speaker/{id}", method = POST)
    public Speaker updateSpeaker(@PathVariable("id") Long id, @RequestBody Speaker speaker) {
        return speakerService.updateSpeaker(id, speaker);
    }

}
