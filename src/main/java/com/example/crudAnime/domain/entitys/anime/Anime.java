package com.example.crudAnime.domain.entitys.anime;

import com.example.crudAnime.domain.custon.Statistics;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "anime")
public class Anime {

    @Id
    @Column(name = "id")
    private UUID id;
    @Column(name = "episodes")
    private Integer episodes;
    @Column(name = "title")
    private String title;
    @Column(name = "status")
    private String status;
    @Column(name = "premirer")
    private String premirer;
    @Column(name = "studio")
    private String studio;
    @Column(name = "genres")
    private String genres;

    public Anime(AnimeRequest animeRequest){
        this.id = UUID.randomUUID();
        this.title = animeRequest.getTitle();
        this.episodes = animeRequest.getEpisodes();
        this.status = animeRequest.getStatus();
        this.premirer = animeRequest.getPremirer();
        this.studio = animeRequest.getStudio();
        this.genres = animeRequest.getGenres();
    }

    public void updateAnime(AnimeRequest animeRequest){
        if (animeRequest.getTitle() != null) this.title = animeRequest.getTitle();
        if (animeRequest.getEpisodes() != null) this.episodes = animeRequest.getEpisodes();
        if (animeRequest.getStatus() != null) this.status = animeRequest.getStatus();
        if (animeRequest.getPremirer() != null) this.premirer = animeRequest.getPremirer();
        if (animeRequest.getStudio() != null) this.studio = animeRequest.getStudio();
        if (animeRequest.getGenres() != null) this.genres = animeRequest.getGenres();
    }

}
