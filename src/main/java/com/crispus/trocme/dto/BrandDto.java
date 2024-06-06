package com.crispus.trocme.dto;

import java.io.Serializable;
import org.modelmapper.ModelMapper;
import com.crispus.trocme.models.Brand;

public class BrandDto implements Serializable{
    private String name;
    private String category;
    private String descriptions;

    public static BrandDto fromEntity(Brand brands){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(brands, BrandDto.class);
    }

    public static Brand toEntity(BrandDto brandsDto){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(brandsDto, Brand.class);
    }
}
