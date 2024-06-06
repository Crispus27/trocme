package com.crispus.trocme.impl;

import org.springframework.stereotype.Service;

import com.crispus.trocme.dto.CategoryDto;
import com.crispus.trocme.models.Category;
import com.crispus.trocme.repository.CategoryRepository;
import com.crispus.trocme.services.CategoryService;
import com.crispus.trocme.validator.ObjetValidator;

import lombok.RequiredArgsConstructor;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository repository;
    //private final ObjetValidator<CategoryDto> validator;

   /*  public Integer save(CategoryDto dto) {
        return repository.save(Category).getId();
    } */

    @Override
    public Integer save(CategoryDto dto) {
        validator.validate(dto);
        Category category = CategoryDto.toEntity(dto);
        return repository.save(category);
    }

    @Override
    public List<CategoryDto> findAll() {
        return repository.findAll()
                .stream()
                .map(CategoryDto::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDto findById(Integer id) {
        return repository.findById(id)
                .map(CategoryDto::fromEntity)
                .orElseThrow(()-> new EntityNotFoundException("No categorises was found with the provided"+ id));
    }

    @Override
    public void delete(Integer id) {
         repository.deleteById(id);

    }
}
