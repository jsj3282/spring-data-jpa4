package com.example.springdatajpa4.post;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long>, JpaSpecificationExecutor<Comment>, QueryByExampleExecutor<Comment> {

//    @EntityGraph(value = "Comment.post")
    @EntityGraph(attributePaths = "post")
    Comment getById(Long Id);

//    List<Comment> findByPost_Id(Long Id);

//    List<CommentSummary> findByPost_Id(Long Id);

    @Transactional(readOnly = true)
    <T> List<T> findByPost_Id(Long Id, Class<T> type);
}
