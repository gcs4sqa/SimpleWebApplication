package com.gcs4sqa.simplewebapplicaton.repositories;

import com.gcs4sqa.simplewebapplicaton.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
