package com.spring.boot.kata.bootstrap;

import com.spring.boot.kata.model.Author;
import com.spring.boot.kata.model.Book;
import com.spring.boot.kata.model.Publisher;
import com.spring.boot.kata.repositories.AuthorRepository;
import com.spring.boot.kata.repositories.BookRepository;
import com.spring.boot.kata.repositories.PublisherRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Slf4j
public class BootStrapData implements CommandLineRunner {
    AuthorRepository authorRepository;
    BookRepository bookRepository;
    PublisherRepository publisherRepository;


    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("started bootstrapping book data");
        var author = new Author("Paul", "Coelho");
        var alchemistBook = new Book("The Alchemist", "001");
        var publisher = new Publisher("Sas Publications", "Sas Villa", "Sas city", "Sas State", "Sas Zipcode");
        author.setBooks(Set.of(alchemistBook));
        publisher.setBooks(Set.of(alchemistBook));

        bookRepository.save(alchemistBook);
        authorRepository.save(author);
        publisherRepository.save(publisher);
        log.info("number of books saved " + bookRepository.count());
        log.info("number of publishers saved " + publisherRepository.count());
        log.info("number of books publishers have " + publisher.getBooks().size());
    }
}
