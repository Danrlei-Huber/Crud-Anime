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
    private UUID id;
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
