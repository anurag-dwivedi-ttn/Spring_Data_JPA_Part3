package com.example.jpa3.entity;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Q5) Create an Entity Book with an instance variable bookName.
    private String bookName;

    // Q7) Implement One to Many Mapping between Author and Book (Bidirectional)
    @ManyToOne
    @JoinColumn(name = "author_id") // This column stores the foreign key
    private Author author;

    // Constructors
    public Book() {}
}
