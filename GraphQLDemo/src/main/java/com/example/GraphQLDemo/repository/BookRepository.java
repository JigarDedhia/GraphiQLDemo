package com.example.GraphQLDemo.repository;

import com.example.GraphQLDemo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> { }

