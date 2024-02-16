package com.example.crudAnime.domain.entitys.anime;

import com.example.crudAnime.domain.custon.Statistics;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnimeDTO {

    private Integer episodes;
    private String status;
    private String premirer;
    private String studio;
    private String genres;
}
