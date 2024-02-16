package com.example.crudAnime.domain.entitys.manga;

import com.example.crudAnime.domain.custon.Statistics;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MangaDTO {

    private Integer volumes;
    private Integer chapters;
    private String status;
    private String serialization;
    private String authors;
    private Statistics statistics;

}
