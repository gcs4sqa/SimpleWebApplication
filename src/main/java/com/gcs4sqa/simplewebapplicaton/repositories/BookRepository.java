package com.gcs4sqa.simplewebapplicaton.repositories;

import com.gcs4sqa.simplewebapplicaton.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
