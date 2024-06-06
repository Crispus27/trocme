package com.crispus.trocme.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crispus.trocme.dto.NotificationDto;
import com.crispus.trocme.services.NotificationService;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping(path = "notifications")
@RequiredArgsConstructor
public class NotificationController {
private NotificationService service;

    @PostMapping("/")
    public ResponseEntity<Integer> save(
            @RequestBody NotificationDto notificationsDto
    ){
        return ResponseEntity.ok(service.save(notificationsDto));
    }

    @GetMapping("")
    public ResponseEntity<List<NotificationDto>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("/{notifications-id}")
    public ResponseEntity<NotificationDto> findById(
            @PathVariable("notifications-id") Integer notificationsId
    ){
        return ResponseEntity.ok(service.findById(notificationsId));
    }


    @DeleteMapping("/{notifications-id}")
    public ResponseEntity<Void> delete(
            @PathVariable("notifications-id") Integer notificationsId
    ){
        service.delete(notificationsId);
        return ResponseEntity.accepted().build();
    }
}
