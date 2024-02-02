package com.example.crudAnime.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class readController {

    @GetMapping
    public ResponseEntity<String> heloo(){
        return ResponseEntity.ok("olhar, api de anime, eh bomba kkkkkk");
    }
}
