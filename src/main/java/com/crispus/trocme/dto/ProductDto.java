package com.crispus.trocme.dto;

import org.modelmapper.ModelMapper;

import com.crispus.trocme.models.Product;

public class ProductDto {
 public static ProductDto fromEntity(Product product){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(product, ProductDto.class);
    }

    public static Product toEntity(ProductDto productsDto){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(productsDto, Product.class);
    }
}
