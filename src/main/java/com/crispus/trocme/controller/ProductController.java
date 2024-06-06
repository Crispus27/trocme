package com.crispus.trocme.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crispus.trocme.dto.ProductDto;
import com.crispus.trocme.services.ProductService;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping(path = "product")
@RequiredArgsConstructor
public class ProductController {
private ProductService service;


    @PostMapping("/")
    public ResponseEntity<Integer> save(
            @RequestBody ProductDto productsDto
    ){
        return ResponseEntity.ok(service.save(productsDto));
    }

    @GetMapping("")
    public ResponseEntity<List<ProductDto>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("/{products-id}")
    public ResponseEntity<ProductDto> findById(
            @PathVariable("products-id") Integer productsId
    ){
        return ResponseEntity.ok(service.findById(productsId));
    }


    @DeleteMapping("/{products-id}")
    public ResponseEntity<Void> delete(
            @PathVariable("products-id") Integer productsId
    ){
        service.delete(productsId);
        return ResponseEntity.accepted().build();
    }
}
