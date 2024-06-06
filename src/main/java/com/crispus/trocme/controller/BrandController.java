package com.crispus.trocme.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crispus.trocme.dto.BrandDto;
import com.crispus.trocme.services.BrandService;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping(path = "brand")
@RequiredArgsConstructor
public class BrandController {
private BrandService service;

    @PostMapping("/")
    public ResponseEntity<Integer> save(
            @RequestBody BrandDto brandsDto
            ){
        return ResponseEntity.ok(service.save(brandsDto));
    }

    @GetMapping("/")
    public ResponseEntity<List<BrandDto>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{brand-id}")
    public ResponseEntity<BrandDto> findById(
            @PathVariable("brand-id") Integer brandId
    ){
        return ResponseEntity.ok(service.findById(brandId));
    }

    @DeleteMapping("/{brands-id}")
    public ResponseEntity<Void> delete(
            @PathVariable("brand-id") Integer brandId
    ){
        service.delete(brandId);
        return ResponseEntity.accepted().build();
    }

}
