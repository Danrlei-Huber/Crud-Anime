package com.example.crudAnime.domain.entitys.anime;

import jakarta.persistence.EntityManager;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;
import java.util.UUID;

@DataJpaTest
@ActiveProfiles("test")
class AnimeRepositoryTest {

    @Autowired
    AnimeRepository animeRepository;

    @Autowired
    EntityManager entityManager;

    @Test
    @DisplayName("Successfully searches the anime table for a title")
    void findByTitleSuccess() {
        String title = "Psycho-Pass";
        AnimeRequest animeRequest = new AnimeRequest(
                UUID.randomUUID().toString(),
                title,
                22,
                "Em andamento",
                "Fall 2012",
                "Funimation",
                "Ação,Suspense,Misterio,Detetive"
        );
        this.insertNewAnime(animeRequest);
        Optional<Anime> result = this.animeRepository.findByTitle(title);
        Assertions.assertThat(result.isPresent()).isTrue();
    }

    @Test
    @DisplayName("Search the anime table for a failed title")
    void findByTitleFailure() {
        String title = "Psycho-Pass";
        Optional<Anime> result = this.animeRepository.findByTitle(title);
        Assertions.assertThat(result.isPresent()).isFalse();
    }

    private Anime insertNewAnime(AnimeRequest animeRequest){
        Anime newAnime = new Anime(animeRequest);
        this.entityManager.persist(newAnime);
        return newAnime;
    }

}