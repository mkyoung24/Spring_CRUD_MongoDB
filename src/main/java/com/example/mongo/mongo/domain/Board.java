package com.example.mongo.mongo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "board")
public class Board {

    @Id
    private String _id;

    private String title;

    private String content;
}
