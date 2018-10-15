package com.example.demo.repository;

import com.example.demo.entity.Game;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface GameRepository extends MongoRepository<Game,Integer>{
    public List<Game> findByName(String name);
}
