package com.example.crudAnime.services;

import com.example.crudAnime.domain.Response;
import com.example.crudAnime.domain.entitys.manga.Manga;
import com.example.crudAnime.domain.entitys.manga.MangaRepository;
import com.example.crudAnime.domain.entitys.manga.MangaRequest;
import com.example.crudAnime.exceptions.ExceptionNotFoundContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class MangaService {

    @Autowired
    MangaRepository mangaRepository;

    public Response insertNewManga(MangaRequest mangaRequest){
        try {
            Manga manga = new Manga(mangaRequest);
            mangaRepository.save(manga);
            return new Response(true, "Manga inserted successfully", "");
        } catch (Exception err){
            throw new RuntimeException("unexpected error encountered");
        }
    }

    public Response getAllMangas(){
        try {
            List<Manga> mangaList = mangaRepository.findAll();
            return new Response(true, "Complete search", mangaList);
        } catch (Exception err){
            throw new RuntimeException("unexpected error encountered");
        }
    }

    public Response updateMangaInfo(MangaRequest mangaRequest){
        try {
            String id = mangaRequest.getId();
            Optional<Manga> mangaResponseQuery = mangaRepository.findById(UUID.fromString(id));
            if (mangaResponseQuery.isPresent()) {
                Manga manga = mangaResponseQuery.get();
                manga.updateManga(mangaRequest);
                mangaRepository.save(manga);
                return new Response(true, "Manga updated successfully", manga);
            } else {
                throw new ExceptionNotFoundContent();
            }
        } catch (ExceptionNotFoundContent err){
            throw err;
        }
        catch (Exception err){
            throw new RuntimeException("unexpected error encountered");
        }
    }

    public Response deleteManga(String id){
        try {
            mangaRepository.deleteById(UUID.fromString(id));
            return new Response(true,
                    "Successfully deleted manga", "");
        } catch (Exception err){
            throw new RuntimeException("unexpected error encountered");
        }
    }
}
