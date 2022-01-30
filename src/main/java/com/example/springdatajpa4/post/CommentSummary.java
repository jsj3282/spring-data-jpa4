package com.example.springdatajpa4.post;

import org.springframework.beans.factory.annotation.Value;

public interface CommentSummary {

    String getComment();

    int getUp();

    int getDown();

    default String getVotes() {
        return getUp() + " " + getDown();
    }

//    @Value("#{target.up + ' ' + target.down}")
//    String getVotes();
}
