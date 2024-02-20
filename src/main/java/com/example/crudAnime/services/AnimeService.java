package com.example.crudAnime.services;

import com.example.crudAnime.domain.Response;
import com.example.crudAnime.domain.entitys.anime.Anime;
import com.example.crudAnime.domain.entitys.anime.AnimeRepository;
import com.example.crudAnime.domain.entitys.anime.AnimeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class AnimeService {

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

    public Response getAllAnime(){
        try {
            List<Anime> animeResponse = animeRepository.findAll();
            return new Response(true,
                    "Lista de animes obtida com sucesso", animeResponse);
        } catch (Exception err){
            return new Response("ERRO");
        }
    }

    public Response alterAnime(AnimeRequest animeRequest){
        try {
            String animeId = animeRequest.getId();
            Optional<Anime> animeResponseQuery = animeRepository.findById(UUID.fromString(animeId));
            if (animeResponseQuery.isPresent()){
                Anime anime = animeResponseQuery.get();
                anime.updateAnime(animeRequest);
                animeRepository.save(anime);
                return new Response(true,
                        "info anime alterada com sucesso", anime);
            } else {
                return new Response(true, "anime nao encontrado", "");
            }

        } catch (Exception err) {
            return new Response("ERRO");
        }
    }

    public Response deleteAnime(String id){
        try {
            animeRepository.deleteById(UUID.fromString(id));
            return new Response(true,
                    "Anime deletado com sucesso", "");
        } catch (Exception err){
            return new Response("ERRO");
        }
    }

}
