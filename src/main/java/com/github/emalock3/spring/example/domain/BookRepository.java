package com.github.emalock3.spring.example.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
  Page<Book> findAll(Pageable pageable);
}
