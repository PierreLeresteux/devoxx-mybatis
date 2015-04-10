package fr.devoxx.dao;

import fr.devoxx.dto.Speaker;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SpeakerObjectMapper {

    List<Speaker> getSpeakers();

    Speaker getSpeakers(@Param("id") Long id);

    @Update("UPDATE speaker" +
            "   SET nom = #{speaker.nom}," +
            "   prenom = #{speaker.prenom}," +
            "   mail = #{speaker.mail}," +
            "   twitter = #{speaker.twitter}" +
            "   WHERE id=#{speaker.id}")
    void update(@Param("speaker") Speaker speaker);
}
