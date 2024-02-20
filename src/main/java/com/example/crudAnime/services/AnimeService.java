package com.example.crudAnime.services;

import com.example.crudAnime.domain.Response;
import com.example.crudAnime.domain.entitys.anime.Anime;
import com.example.crudAnime.domain.entitys.anime.AnimeRepository;
import com.example.crudAnime.domain.entitys.anime.AnimeRequest;
import com.example.crudAnime.exceptions.ExceptionNotFoundContent;
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
                    "Anime added successfully", "");
        } catch (Exception err) {
            throw new RuntimeException("unexpected error encountered");
        }
    }

    public Response getAllAnime(){
        try {
            List<Anime> animeResponse = animeRepository.findAll();
            return new Response(true,
                    "List of animes successfully obtained", animeResponse);
        } catch (Exception err){
            throw new RuntimeException("unexpected error encountered");
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
                        "anime info successfully changed", anime);
            } else {
                throw new ExceptionNotFoundContent();
            }

        } catch (ExceptionNotFoundContent err){
            throw err;
        }
        catch (Exception err) {
            throw new RuntimeException("unexpected error encountered");
        }
    }

    public Response deleteAnime(String id){
        try {
            animeRepository.deleteById(UUID.fromString(id));
            return new Response(true,
                    "Anime successfully deleted", "");
        } catch (Exception err){
            throw new RuntimeException("unexpected error encountered");
        }
    }

}
