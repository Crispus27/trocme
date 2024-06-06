package com.crispus.trocme.dto;

import org.modelmapper.ModelMapper;

import com.crispus.trocme.models.Rating;

public class RatingDto {
public static RatingDto fromEntity(Rating rating){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(rating, RatingDto.class);
    }

    public static Rating toEntity(RatingDto ratingDto){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(ratingDto, Rating.class);
    }
}
