package com.example.jpa3.service;

import com.example.jpa3.entity.Author;
import com.example.jpa3.repository.AuthorRepository;
import com.example.jpa3.repository.BookRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public AuthorService(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @PersistenceContext
    private EntityManager entityManager;

    // Q4: Persist 3 subjects per author
    @Transactional
    public void saveAuthorWithSubjects() {
        Author author = new Author();
        author.setName("John Doe");
        author.setSubjects(List.of("Math", "Science", "History"));
        authorRepository.save(author);
    }

    // Q9: Remove object from Hibernate Cache
    public void removeAuthorFromCache(Author author) {
        Session session = entityManager.unwrap(Session.class);
        session.evict(author);  // Removes object from Hibernate cache
    }
}
