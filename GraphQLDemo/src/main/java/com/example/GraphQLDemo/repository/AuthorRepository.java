package com.example.GraphQLDemo.repository;

import com.example.GraphQLDemo.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> { }
