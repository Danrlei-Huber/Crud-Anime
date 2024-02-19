package com.example.crudAnime.domain.entitys.manga;

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

    public Manga(){
        this.id = UUID.randomUUID();
    }

}
