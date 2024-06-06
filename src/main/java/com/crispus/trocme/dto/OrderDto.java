package com.crispus.trocme.dto;

import org.modelmapper.ModelMapper;

import com.crispus.trocme.models.Order;

public class OrderDto {
public static OrderDto fromEntity(Order order){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(order, OrderDto.class);
    }

    public static Order toEntity(OrderDto orderDto){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(orderDto, Order.class);
    }
}
