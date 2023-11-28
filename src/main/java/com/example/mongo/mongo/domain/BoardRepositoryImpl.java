package com.example.mongo.mongo.domain;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.support.QuerydslRepositorySupport;

public class BoardRepositoryImpl extends QuerydslRepositorySupport {

    public BoardRepositoryImpl(MongoOperations operations) {

        super(operations);
    }
}
