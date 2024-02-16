package com.example.crudAnime.domain.entitys.manga;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MangaRepository extends JpaRepository<Manga, UUID> {

    public default void diz(){
        System.out.println("diz");
    }
}
