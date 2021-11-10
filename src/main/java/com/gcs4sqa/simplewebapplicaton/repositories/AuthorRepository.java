package com.gcs4sqa.simplewebapplicaton.repositories;

import com.gcs4sqa.simplewebapplicaton.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
