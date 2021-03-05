package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
 
import com.example.demo.model.Comment;


public interface CommentRepository extends JpaRepository<Comment, Long>{
    List<Comment> findAllByacccode(long acccode);
    List<Comment> findAllByuserid(long userid);
}
