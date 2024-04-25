package com.example.ApiNoticias.repository;

import com.example.ApiNoticias.model.Entity;
import org.springframework.data.mongodb.repository.MongoRepository;

@org.springframework.stereotype.Repository
public interface Repository extends MongoRepository<Entity, String> {
}
