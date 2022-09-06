package com.spring.boot.kata.repositories;

import com.spring.boot.kata.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
