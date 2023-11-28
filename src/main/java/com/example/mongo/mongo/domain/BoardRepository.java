package com.example.mongo.mongo.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.Optional;

public interface BoardRepository extends MongoRepository<Board, String>, QuerydslPredicateExecutor<Board> {
    
}
