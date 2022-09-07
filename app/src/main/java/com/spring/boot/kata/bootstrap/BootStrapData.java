package com.spring.boot.kata.bootstrap;

import com.spring.boot.kata.model.Author;
import com.spring.boot.kata.model.Book;
import com.spring.boot.kata.repositories.AuthorRepository;
import com.spring.boot.kata.repositories.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Slf4j
public class BootStrapData implements CommandLineRunner {
    AuthorRepository authorRepository;
    BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        var paul = new Author("Paul", "Coelho");
        var alchemist = new Book("The Alchemist", "001");
        paul.setBooks(Set.of(alchemist));
        bookRepository.save(alchemist);
        authorRepository.save(paul);

        log.info("started bootstraping book data");
        log.info("number of books saved " + bookRepository.count());
    }
}
