package com.example.crudAnime.controllers;

import com.example.crudAnime.domain.Response;
import com.example.crudAnime.domain.entitys.manga.MangaRequest;
import com.example.crudAnime.services.MangaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/manga")
public class MangaController {

    @Autowired
    private MangaService mangaService;

    @PostMapping(value = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> newManga(@RequestBody MangaRequest mangaRequest){
        Response response = mangaService.insertNewManga(mangaRequest);
        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "/getAll")
    public ResponseEntity<Response> getAllMangas(){
        Response response = mangaService.getAllMangas();
        return ResponseEntity.ok(response);
    }

    @PatchMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> updateManga(@RequestBody MangaRequest mangaRequest){
        Response response = mangaService.updateMangaInfo(mangaRequest);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Response> deleteManga(@PathVariable("id") String id){
        Response response = mangaService.deleteManga(id);
        return ResponseEntity.ok(response);
    }

}
