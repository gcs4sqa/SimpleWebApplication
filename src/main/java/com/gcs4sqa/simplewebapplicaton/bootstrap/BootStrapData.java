package com.gcs4sqa.simplewebapplicaton.bootstrap;

import com.gcs4sqa.simplewebapplicaton.domain.Author;
import com.gcs4sqa.simplewebapplicaton.domain.Book;
import com.gcs4sqa.simplewebapplicaton.domain.Publisher;
import com.gcs4sqa.simplewebapplicaton.repositories.AuthorRepository;
import com.gcs4sqa.simplewebapplicaton.repositories.BookRepository;
import com.gcs4sqa.simplewebapplicaton.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Evans");
        Book ddd= new Book("Domain driven design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB= new Book("J2EE development without EJBN", "ouiyiouyoiu");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        authorRepository.save(rod);
        bookRepository.save(noEJB);

        Publisher penguin = new Publisher("Penguin","Sibsey Court", "Grimsby", "N E Lincs", "DN37 9FD");
        penguin.getBooks().add(ddd);
        penguin.getBooks().add(noEJB);
        publisherRepository.save(penguin);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of books = " + bookRepository.count());
        System.out.println("Publish has " + penguin.getBooks().size());

    }
}
