package com.example.crudAnime.domain.entitys.anime;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AnimeRepository extends JpaRepository<Anime, UUID> {


}
