package com.crispus.trocme.repository;

import org.hibernate.annotations.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

import com.crispus.trocme.models.Comment;

import java.util.List;

public interface CommentRepository extends JpaRepository <Comment,Integer>{

    List<Comments> findById(int id);

    List<Comments> findAllByDescriptions(String descriptions);

    List<Comments>findAllByDescriptionsContaining(String descriptions);

    void deleteByName(String descriptions);
}
