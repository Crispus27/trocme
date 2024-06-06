package com.crispus.trocme.dto;

import org.modelmapper.ModelMapper;

import com.crispus.trocme.models.Payment;

public class PaymentDto {
public static PaymentDto fromEntity(Payment payments){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(payments, PaymentDto.class);
    }

    public static Payment toEntity(PaymentDto paymentDto){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(paymentDto, Payment.class);
    }
}
