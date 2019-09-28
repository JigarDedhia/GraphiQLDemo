package com.example.GraphQLDemo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.GraphQLDemo.model.Author;
import com.example.GraphQLDemo.model.Book;
import com.example.GraphQLDemo.repository.AuthorRepository;

public class BookResolver implements GraphQLResolver<Book> {
    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book) {
        return authorRepository.findById(book.getAuthor().getId()).get();
    }
}
