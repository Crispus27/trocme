package com.crispus.trocme.dto;

import org.hibernate.annotations.Comments;
import org.modelmapper.ModelMapper;

public class CommentDto {
    private String name;
    private String descriptions;

    public static CommentDto fromEntity(Comments comment){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(comment, CommentDto.class);
    }

    public static Comments toEntity(CommentDto commentDto){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(commentDto, Comments.class);
    }
}
