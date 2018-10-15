package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Document(collection = "locations")

public class Location {
    @Id
    int id;
    String full_name;
    String short_name;
    String msc;
    String street;
    int number;



}
