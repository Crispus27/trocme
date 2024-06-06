package com.crispus.trocme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crispus.trocme.models.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer>{
   /*  List<Product> findById(int id);

    List<Product> findAllByName(String name);

    List<Product> findAllByNameContaining(String name);



    void deleteByName(String name); */
}
