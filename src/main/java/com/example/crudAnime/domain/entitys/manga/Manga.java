package com.example.crudAnime.domain.entitys.manga;

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
@Table(name = "manga")
public class Manga {

    @Id
    @Column(name = "id")
    private UUID id;
    @Column(name = "title")
    private String title;
    @Column(name = "volumes")
    private Integer volumes;
    @Column(name = "chapters")
    private Integer chapters;
    @Column(name = "status")
    private String status;
    @Column(name = "serialization")
    private String serialization;
    @Column(name = "authors")
    private String authors;

    public Manga(MangaRequest mangaRequest){
        this.id = UUID.randomUUID();
        this.title = mangaRequest.getTitle();
        this.volumes = mangaRequest.getVolumes();
        this.chapters = mangaRequest.getChapters();
        this.status = mangaRequest.getStatus();
        this.serialization = mangaRequest.getSerialization();
        this.authors = mangaRequest.getAuthors();
    }

    public void updateManga(MangaRequest mangaRequest){
        if (mangaRequest.getTitle() != null) this.title = mangaRequest.getTitle();
        if (mangaRequest.getVolumes() != null) this.volumes = mangaRequest.getVolumes();
        if (mangaRequest.getChapters() != null) this.chapters = mangaRequest.getChapters();
        if (mangaRequest.getStatus() != null) this.status = mangaRequest.getStatus();
        if (mangaRequest.getSerialization() != null) this.serialization = mangaRequest.getSerialization();
        if (mangaRequest.getAuthors() != null) this.authors = mangaRequest.getAuthors();

    }

}
