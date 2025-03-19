package com.example.jpa3.entity;

import com.example.jpa3.embedded.Address;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Q2) Create instance variable of Address class inside Author class and save it as an embedded object.
    @Embedded
    private Address address;

    // Q3) Introduce a List of subjects for author.
    @ElementCollection
    private List<String> subjects;

    // Q7) Implement One to Many Mapping between Author and Book (Bidirectional mapping)
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Book> books;

    // Constructors
    public Author() {}

    // Getters and Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
