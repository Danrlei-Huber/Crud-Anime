package com.example.crudAnime.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class ApiInfoController {

    @GetMapping
    public ResponseEntity<String> heloo(){
        return ResponseEntity.ok("API - Anime crud v.0.1");
        //criar um sistema com avaliacoes
        //a partir das avaliacoes criar as metricas
        //criar um sistema de usuarios
        //criar rotas que buscam dados de imagem e complementos de apis de base de dados de anime
        //adicionar servicos de terceiros
        //fazer deploy online na aws
    }
}
