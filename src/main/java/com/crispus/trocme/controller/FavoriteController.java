package com.crispus.trocme.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.crispus.trocme.dto.FavoriteDto;
import com.crispus.trocme.services.FavoriteService;

public class FavoriteController {
private FavoriteService service;

    @PostMapping("/")
    public ResponseEntity<Integer> save(
            @RequestBody FavoriteDto favoritesDto
    ){
        return ResponseEntity.ok(service.save(favoritesDto));
    }

    @GetMapping("/")
    public ResponseEntity<List<FavoriteDto>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{favorites-id}")
    public ResponseEntity<FavoriteDto> findById(
            @PathVariable("favorites-id") Integer favoritesId
    ){
        return ResponseEntity.ok(service.findById(favoritesId));
    }

    @DeleteMapping("/{favorites-id}")
    public ResponseEntity<Void> delete(
            @PathVariable("brand-id") Integer favorites
    ){
        service.delete(favorites);
        return ResponseEntity.accepted().build();
    }
}
