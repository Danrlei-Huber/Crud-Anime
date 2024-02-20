package com.example.crudAnime.domain.entitys.manga;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MangaRequest {
    private String id;
    private String title;
    private Integer volumes;
    private Integer chapters;
    private String status;
    private String serialization;
    private String authors;
}
