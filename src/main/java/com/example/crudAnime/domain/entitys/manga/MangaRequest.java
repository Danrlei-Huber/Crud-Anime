package com.example.crudAnime.domain.entitys.manga;

import jakarta.persistence.Column;

public class MangaRequest {
    private String title;
    private String id;
    private Integer episodes;
    private String status;
    private String premirer;
    private String studio;
    private String genres;
}
