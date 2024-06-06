package com.crispus.trocme.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crispus.trocme.dto.CommentDto;
import com.crispus.trocme.services.CommentService;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping(path = "comments")
@RequiredArgsConstructor
public class CommentController {
    private CommentService service;

    @PostMapping("/")
    public ResponseEntity<Integer> save(
            @RequestBody CommentDto commentsDto
    ){
        return ResponseEntity.ok(service.save(commentsDto));
    }

    @GetMapping("/")
    public ResponseEntity<List<CommentDto>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("/{comments-id}")
    public ResponseEntity<CommentDto> findById(
            @PathVariable("comments-id") Integer commentsId
    ){
        return ResponseEntity.ok(service.findById(commentsId));
    }

    @DeleteMapping("/{comments-id}")
    public ResponseEntity<Void> delete(
            @PathVariable("comments-id") Integer commentsId
    ){
        service.delete(commentsId);
        return ResponseEntity.accepted().build();
    }
}
