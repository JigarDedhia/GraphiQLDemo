package com.example.GraphQLDemo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.GraphQLDemo.model.Author;
import com.example.GraphQLDemo.model.Book;
import com.example.GraphQLDemo.repository.AuthorRepository;
import com.example.GraphQLDemo.repository.BookRepository;

public class Query implements GraphQLQueryResolver {
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public Query(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public long countBooks() {
        return bookRepository.count();
    }
    public long countAuthors() {
        return authorRepository.count();
    }
}
