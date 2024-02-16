package com.example.crudAnime.services;

import com.example.crudAnime.domain.Response;
import com.example.crudAnime.domain.entitys.anime.Anime;
import com.example.crudAnime.domain.entitys.anime.AnimeRepository;
import com.example.crudAnime.domain.entitys.anime.AnimeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoadAnimeService {

    @Autowired
    private AnimeRepository animeRepository;

    public Response insertNewAnime(AnimeRequest animeRequest){
        try {
            Anime anime = new Anime(animeRequest);
            animeRepository.save(anime);
            return new Response(
                    true,
                    "Anime adicionado com exito", "");
        } catch (Exception err) {
            return new Response("ERRO");
        }
    }

}
