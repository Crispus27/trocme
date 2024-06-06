package com.crispus.trocme.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crispus.trocme.dto.CategoryDto;
import com.crispus.trocme.services.CategoryService;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping(path = "category")
@RequiredArgsConstructor
public class CategoryController {
    private CategoryService service;

    @PostMapping("/")
    public ResponseEntity<Integer> save(
            @RequestBody CategoryService categorisesDto
            ){
        return ResponseEntity.ok(service.save(categorisesDto));
    }

    @GetMapping("/")
    public ResponseEntity<List<CategoryDto>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

  /*   @PostMapping("/{categorises-id}")
    public ResponseEntity<CategoryDto> findById(
            @PathVariable("categorises-id") Integer categorisesId
    ){
        return ResponseEntity.ok(service.findById(categorisesId));
    } */

    @DeleteMapping("/{categorises-id}")
    public ResponseEntity<Void> delete(
            @PathVariable("categorises-id") Integer categorisesId
    ){
        service.delete(categorisesId);
        return ResponseEntity.accepted().build();
    }
}
