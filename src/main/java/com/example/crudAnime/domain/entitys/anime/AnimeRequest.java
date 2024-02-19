package com.example.crudAnime.domain.entitys.anime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnimeRequest {
    private String id;
    private String title;
    private Integer episodes;
    private String status;
    private String premirer;
    private String studio;
    private String genres;
}
