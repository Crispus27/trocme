package com.crispus.trocme.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crispus.trocme.dto.PaymentDto;
import com.crispus.trocme.services.PaymentService;

import lombok.RequiredArgsConstructor;
import java.util.List;
@RestController
@RequestMapping(path = "payments")
@RequiredArgsConstructor
public class PaymentController {
    private PaymentService service;

    @PostMapping("/")
    public ResponseEntity<Integer> save(
            @RequestBody PaymentDto paymentsDto
    ){
        return ResponseEntity.ok(service.save(paymentsDto));
    }

    @GetMapping("")
    public ResponseEntity<List<PaymentDto>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("/{payments-id}")
    public ResponseEntity<PaymentDto> findById(
            @PathVariable("payments-id") Integer paymentsId
    ){
        return ResponseEntity.ok(service.findById(paymentsId));
    }


    @DeleteMapping("/{payments-id}")
    public ResponseEntity<Void> delete(
            @PathVariable("orders-id") Integer paymentsId
    ){
        service.delete(paymentsId);
        return ResponseEntity.accepted().build();
    }
}
