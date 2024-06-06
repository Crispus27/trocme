package com.crispus.trocme.dto;

import org.modelmapper.ModelMapper;

import com.crispus.trocme.models.Favorite;

public class FavoriteDto {
public static FavoriteDto fromEntity(Favorite favorite){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(favorite, FavoriteDto.class);
    }

    public static Favorite toEntity(FavoriteDto favoritesDto){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(favoritesDto, Favorite.class);
    }
}
