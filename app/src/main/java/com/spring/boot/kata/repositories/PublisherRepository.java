package com.spring.boot.kata.repositories;

import com.spring.boot.kata.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
