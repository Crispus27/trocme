package com.crispus.trocme.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crispus.trocme.models.Category;
public interface CategoryRepository extends JpaRepository<Category,Integer> {

    List<Category> findById(int id);

    List<Category>findAllByName(String name);

    List<Category>findAllByNameContaining(String name);

    void deleteByName(String name);
    void deleteById(int id);
    int save(Category category);

}
