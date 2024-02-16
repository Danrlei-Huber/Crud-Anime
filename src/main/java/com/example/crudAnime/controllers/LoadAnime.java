package com.example.crudAnime.controllers;

import com.example.crudAnime.domain.Response;
import com.example.crudAnime.domain.entitys.anime.AnimeRequest;
import com.example.crudAnime.services.LoadAnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/anime")
public class LoadAnime {

    @Autowired
    private LoadAnimeService loadAnimeService;

    @PostMapping(value = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> newAnime(@RequestBody AnimeRequest animeRequest){
        Response response = loadAnimeService.insertNewAnime(animeRequest);
        if (!response.getStatus()){
            return ResponseEntity.badRequest().body(response);
        }
        return ResponseEntity.ok(response);
    }

}
