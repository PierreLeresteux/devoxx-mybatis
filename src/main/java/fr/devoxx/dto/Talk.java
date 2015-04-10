package fr.devoxx.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Talk {
    private String titre;
    private String conference;
    private int annee;
}
