package com.crispus.trocme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crispus.trocme.models.Brand;
import java.util.List;

public interface BrandRepository extends JpaRepository<Brand, Integer> {

    List<Brand> findById(int id);

    List<Brand> findAllByName(String name);

    List<Brand> findAllByNameContaining(String name);

    List<Brand> findAllByCategory(String category);

    void deleteByName(String name);
}
