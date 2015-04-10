package fr.devoxx.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Speaker {

    private Long id;
    private String prenom;
    private String nom;
    private String mail;
    private String twitter;
    private Emplois currentJob;
    private List<Talk> talk;
}
