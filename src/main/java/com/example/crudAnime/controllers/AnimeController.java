package com.example.crudAnime.controllers;

import com.example.crudAnime.domain.Response;
import com.example.crudAnime.domain.entitys.anime.AnimeRequest;
import com.example.crudAnime.services.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/anime")
public class AnimeController {

    @Autowired
    private AnimeService animeService;

    @PostMapping(value = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> newAnime(@RequestBody AnimeRequest animeRequest){
        Response response = animeService.insertNewAnime(animeRequest);
        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "/getAll")
    public ResponseEntity<Response> getAllAnime(){
        Response response = animeService.getAllAnime();
        return ResponseEntity.ok(response);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Response> deleteAnime(@PathVariable("id") String idProceso){
        Response response = animeService.deleteAnime(idProceso);
        return ResponseEntity.ok(response);
    }

    @PatchMapping(value = "/patch")
    public ResponseEntity<Response> alterAnime(@RequestBody AnimeRequest animeRequest){
        Response response = animeService.alterAnime(animeRequest);
        return ResponseEntity.ok(response);
    }

}
