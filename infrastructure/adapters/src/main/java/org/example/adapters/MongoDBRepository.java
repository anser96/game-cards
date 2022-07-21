package org.example.adapters;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface MongoDBRepository extends ReactiveCrudRepository<CardDocument, String> { }
