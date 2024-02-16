package com.example.crudAnime.domain.entitys.anime;

import com.example.crudAnime.domain.custon.Statistics;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "anime")
public class Anime {

    @Id
    private UUID id;
    @Column(name = "episodes")
    private Integer episodes;
    @Column(name = "status")
    private String status;
    @Column(name = "premirer")
    private String premirer;
    @Column(name = "studio")
    private String studio;
    @Column(name = "genres")
    private String genres;

    public Anime(){
        this.id = UUID.randomUUID();
    }

    public Anime(AnimeRequest animeRequest){
        this.id = UUID.randomUUID();
        this.episodes = animeRequest.getEpisodes();
        this.status = animeRequest.getStatus();
        this.premirer = animeRequest.getPremirer();
        this.studio = animeRequest.getStudio();
        this.genres = animeRequest.getGenres();
    }

}
