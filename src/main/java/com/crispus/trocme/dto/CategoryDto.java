package com.crispus.trocme.dto;

import org.modelmapper.ModelMapper;

import com.crispus.trocme.models.Category;

public class CategoryDto {
    private String name;
    private String descriptions;

    public static CategoryDto fromEntity(Category Category){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(Category, CategoryDto.class);
    }

    public static Category toEntity(CategoryDto CategoryDto){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(CategoryDto, Category.class);
    }
}
