package com.crispus.trocme.repository;

import java.util.List;

import org.hibernate.annotations.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

import com.crispus.trocme.models.Favorite;

public interface FavoriteRepository extends JpaRepository<Favorite,Integer >{
    List<Comments> findById(int id);

    List<Comments> findAllByDescriptions(String descriptions);

    List<Comments>findAllByDescriptionsContaining(String descriptions);

    void deleteByName(String descriptions);
}
