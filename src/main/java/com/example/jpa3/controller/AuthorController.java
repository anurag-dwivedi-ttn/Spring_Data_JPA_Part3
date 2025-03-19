package com.example.jpa3.controller;

import com.example.jpa3.entity.Author;
import com.example.jpa3.service.AuthorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping("/save")
    public String saveAuthor() {
        authorService.saveAuthorWithSubjects();
        return "Author saved with subjects!";
    }

    @DeleteMapping("/evict/{id}")
    public String evictAuthor(@PathVariable Long id) {
        Author author = new Author();
        author.setId(id);
        authorService.removeAuthorFromCache(author);
        return "Author removed from cache!";
    }
}
