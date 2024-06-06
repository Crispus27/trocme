package com.crispus.trocme.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crispus.trocme.dto.OrderDto;
import com.crispus.trocme.services.OrderService;

import lombok.RequiredArgsConstructor;
import java.util.List;
@RestController
@RequestMapping(path = "orders")
@RequiredArgsConstructor
public class OrderController {
private OrderService service;


    @PostMapping("/")
    public ResponseEntity<Integer> save(
            @RequestBody OrderDto ordersDto
    ){
        return ResponseEntity.ok(service.save(ordersDto));
    }

    @GetMapping("")
    public ResponseEntity<List<OrderDto>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("/{orders-id}")
    public ResponseEntity<OrderDto> findById(
            @PathVariable("orders-id") Integer ordersId
    ){
        return ResponseEntity.ok(service.findById(ordersId));
    }


    @DeleteMapping("/{orders-id}")
    public ResponseEntity<Void> delete(
            @PathVariable("orders-id") Integer ordersId
    ){
        service.delete(ordersId);
        return ResponseEntity.accepted().build();
    }
}
